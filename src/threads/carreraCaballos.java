package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Carreras implements Runnable {
    private static int ganador = 0;
    private static final Object lock = new Object();

    @Override
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

public class carreraCaballos {
    public static void main(String[] args) {
        int numThreads = 2; // Cambiar a 8 para ejecutar 8 tareas adicionales

        ExecutorService executorService = Executors.newFixedThreadPool(numThreads);

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < numThreads; i++) {
            executorService.execute(new Carreras());
        }

        executorService.shutdown();

        try {
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Tiempo total de ejecución: " + (endTime - startTime) + " ms");
    }
}