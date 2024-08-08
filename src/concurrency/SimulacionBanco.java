package concurrency;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;

class Banco {
    private static final int NUM_CLIENTES = 100;
    private static final int NUM_CAJEROS = 2;
    private static final int TIEMPO_MAX_ATENCION = 3000; // 3 segundos en milisegundos

    private final ExecutorService executor = Executors.newFixedThreadPool(NUM_CAJEROS);
    private final Object lock = new Object();
    private int clientesAtendidos = 0;

    public void simularAtencion() {
        for (int i = 1; i <= NUM_CLIENTES; i++) {
            final int cliente = i; // Hacer final la variable cliente
            executor.execute(() -> atenderCliente(cliente));
        }

        executor.shutdown();
    }

    private void atenderCliente(int cliente) {
        synchronized (lock) {
            while (clientesAtendidos >= NUM_CLIENTES) {
                System.out.println("Todos los clientes han sido atendidos. Cajero esperando...");
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("Cliente " + cliente + " en espera...");

            while (clientesAtendidos < NUM_CLIENTES) {
                for (int cajero = 1; cajero <= NUM_CAJEROS; cajero++) {
                    if (atenderConCajero(cajero, cliente)) {
                        return;
                    }
                }

                System.out.println("Ambos cajeros ocupados. Cliente " + cliente + " esperando...");
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private boolean atenderConCajero(int cajero, int cliente) {
        System.out.println("Cajero " + cajero + " atendiendo a Cliente " + cliente);
        int tiempoDeAtencion = ThreadLocalRandom.current().nextInt(1, TIEMPO_MAX_ATENCION + 1);
        try {
            Thread.sleep(tiempoDeAtencion);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (lock) {
            System.out.println("Cajero " + cajero + " terminó de atender a Cliente " + cliente);
            clientesAtendidos++;

            if (clientesAtendidos >= NUM_CLIENTES) {
                lock.notifyAll();
            }

            return true;
        }
    }
}

public class SimulacionBanco {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.simularAtencion();
    }
}