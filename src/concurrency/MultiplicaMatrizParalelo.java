package concurrency;

import java.util.Random;

public class MultiplicaMatrizParalelo {

    public static void main(String args[]) {
        int m = 1000, n = 1000, p = 1000, q = 1000;
        int sum = 0, c, d, k;

        // Generar matrices con números aleatorios
        int A[][] = generarMatrizAleatoria(m, n);
        int B[][] = generarMatrizAleatoria(p, q);
        int C[][] = new int[m][q];

        // Medir el tiempo para el algoritmo secuencial
        long startTime = System.currentTimeMillis();
        multiplicarMatrices(A, B, C);
        long endTime = System.currentTimeMillis();
        System.out.println("Tiempo de ejecución (secuencial): " + (endTime - startTime) + " ms");

        // Reiniciar matriz resultado para las versiones paralelas
        C = new int[m][q];

        // Medir el tiempo para el algoritmo paralelo con 2 hilos
        startTime = System.currentTimeMillis();
        multiplicarMatricesParalelo(A, B, C, 2);
        endTime = System.currentTimeMillis();
        System.out.println("Tiempo de ejecución (paralelo, 2 hilos): " + (endTime - startTime) + " ms");

        // Reiniciar matriz resultado para la versión paralela con 4 hilos
        C = new int[m][q];

        // Medir el tiempo para el algoritmo paralelo con 4 hilos
        startTime = System.currentTimeMillis();
        multiplicarMatricesParalelo(A, B, C, 4);
        endTime = System.currentTimeMillis();
        System.out.println("Tiempo de ejecución (paralelo, 4 hilos): " + (endTime - startTime) + " ms");
    }

    private static int[][] generarMatrizAleatoria(int rows, int cols) {
        int[][] matriz = new int[rows][cols];
        Random rand = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matriz[i][j] = rand.nextInt(100) + 1; // Números aleatorios entre 1 y 100
            }
        }
        return matriz;
    }

    private static void multiplicarMatrices(int[][] A, int[][] B, int[][] C) {
        int m = A.length;
        int n = A[0].length;
        int p = B.length;
        int q = B[0].length;

        for (int c = 0; c < m; c++) {
            for (int d = 0; d < q; d++) {
                for (int k = 0; k < p; k++) {
                    C[c][d] += A[c][k] * B[k][d];
                }
            }
        }
    }

    private static void multiplicarMatricesParalelo(int[][] A, int[][] B, int[][] C, int numThreads) {
        int m = A.length;
        int n = A[0].length;
        int p = B.length;
        int q = B[0].length;

        Thread[] threads = new Thread[numThreads];
        int chunkSize = m / numThreads;

        for (int i = 0; i < numThreads; i++) {
            int start = i * chunkSize;
            int end = (i == numThreads - 1) ? m : (i + 1) * chunkSize;
            threads[i] = new Thread(() -> {
                for (int c = start; c < end; c++) {
                    for (int d = 0; d < q; d++) {
                        for (int k = 0; k < p; k++) {
                            C[c][d] += A[c][k] * B[k][d];
                        }
                    }
                }
            });
            threads[i].start();
        }

        try {
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
