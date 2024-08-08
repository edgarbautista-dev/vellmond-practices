package concurrency;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;

class Barberia {
    private int numSillasEspera = 15;
    private final int numSillasAfeitado = 5;
    private int clientesAtendidos = 0;

    public synchronized void llegarCliente(Cliente cliente) throws InterruptedException {
        if (clientesAtendidos < 100) {
            if (ocuparSillaDeEspera()) {
                System.out.println("Cliente " + cliente.getId() + " esperando en la silla de espera.");
                notifyBarbero();
                atenderCliente(cliente);
            } else {
                System.out.println("Cliente " + cliente.getId() + " se marcha, no hay sillas disponibles.");
            }
        }
    }

    private synchronized boolean ocuparSillaDeEspera() {
        if (numSillasEspera > 0) {
            numSillasEspera--;
            return true;
        }
        return false;
    }

    private synchronized void liberarSillaDeEspera() {
        numSillasEspera++;
    }

    private synchronized void notifyBarbero() {
        notify();
    }

    public synchronized void atenderCliente(Cliente cliente) throws InterruptedException {
        System.out.println("Barbero " + Thread.currentThread().getId() + " atendiendo a Cliente " + cliente.getId());
        // Simular el tiempo que tarda el barbero en afeitar
        Thread.sleep(2);

        System.out.println("Barbero " + Thread.currentThread().getId() + " desocupado.");
        System.out.println("Cliente " + cliente.getId() + " atendido, se marcha.");

        liberarSillaDeEspera();
        clientesAtendidos++;
    }

    public synchronized boolean hayClientesEnEspera() {
        return numSillasEspera > 0;
    }

    public synchronized int getClientesAtendidos() {
        return clientesAtendidos;
    }
}

class Barbero implements Runnable {
    private final Barberia barberia;

    public Barbero(Barberia barberia) {
        this.barberia = barberia;
    }

    @Override
    public void run() {
        while (barberia.getClientesAtendidos() < 100) {
            try {
                synchronized (barberia) {
                    while (!barberia.hayClientesEnEspera()) {
                        System.out.println("Barbero " + Thread.currentThread().getId() % 5 + " durmiendo...");
                        barberia.wait();
                    }
                }
                //simular y verificar barbero disponible para atender
                synchronized (barberia) {
                    System.out.println("Barbero " + Thread.currentThread().getId() % 5 + " despierto.");
                }
                Cliente cliente = new Cliente();
                barberia.atenderCliente(cliente);
                // Simular el tiempo que tarda el barbero en atender al cliente entre 5 y 10 ms
                int tiempoDeAtencion = ThreadLocalRandom.current().nextInt(5, 11);
                Thread.sleep(tiempoDeAtencion);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

class Cliente {
    private static int contadorClientes = 0;
    private final int id;

    public Cliente() {
        synchronized (Cliente.class) {
            this.id = ++contadorClientes;
        }
    }

    public int getId() {
        return id;
    }
}

public class SimulacionBarberia {
    public static void main(String[] args) throws InterruptedException {
        Barberia barberia = new Barberia();
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 5; i++) {
            executor.execute(new Barbero(barberia));
        }

        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(50); // Simular intervalos de llegada de clientes
                Cliente cliente = new Cliente();
                barberia.llegarCliente(cliente);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();
        System.out.println("Programa finalizado.");
    }
}