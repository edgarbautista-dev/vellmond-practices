package threads;
class Carrera extends Thread {
    private static int ganador = 0;
    private static Object lock = new Object();

    public void run() {
        int distanciaRecorrida = 0;
        while (distanciaRecorrida < 100) {
            int avance = (int) (Math.random() * 25) + 1;
            distanciaRecorrida += avance;
            System.out.println("Hilo " + Thread.currentThread().getId() + " ha avanzado " + avance + " unidades.");
        }

        synchronized (lock) {
            if (ganador == 0) {
                ganador = (int) Thread.currentThread().getId();
                System.out.println("¡Hilo " + ganador + " es el ganador!");
            }
        }
    }
}

public class CarreraDeCaballos {
    public static void main(String[] args) {
        Carrera hilo1 = new Carrera();
        Carrera hilo2 = new Carrera();
        Carrera hilo3 = new Carrera();
        Carrera hilo4 = new Carrera();

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
    }
}
