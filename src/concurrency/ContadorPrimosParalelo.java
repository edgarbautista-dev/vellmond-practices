package concurrency;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ContadorPrimosParalelo extends RecursiveTask<Integer> {
    private static final int UMBRAL = 10000;
    private final int[] numeros;
    private final int inicio;
    private final int fin;

    public ContadorPrimosParalelo(int[] numeros, int inicio, int fin) {
        this.numeros = numeros;
        this.inicio = inicio;
        this.fin = fin;
    }

    @Override
    protected Integer compute() {
        if (fin - inicio <= UMBRAL) {
            return contarPrimos();
        } else {
            int mitad = inicio + (fin - inicio) / 2;
            ContadorPrimosParalelo izquierda = new ContadorPrimosParalelo(numeros, inicio, mitad);
            ContadorPrimosParalelo derecha = new ContadorPrimosParalelo(numeros, mitad + 1, fin);

            invokeAll(izquierda, derecha);

            return izquierda.join() + derecha.join();
        }
    }

    private int contarPrimos() {
        int contador = 0;
        for (int i = inicio; i <= fin; i++) {
            if (esPrimo(numeros[i])) {
                contador++;
            }
        }
        return contador;
    }

    private boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] numeros = generarNumerosAleatorios(1, 500000, 1000000);

        long startTime = System.currentTimeMillis();

        ForkJoinPool pool = new ForkJoinPool();
        int cantidadPrimos = pool.invoke(new ContadorPrimosParalelo(numeros, 0, numeros.length - 1));

        long endTime = System.currentTimeMillis();

        System.out.println("Cantidad de números primos encontrados: " + cantidadPrimos);
        System.out.println("Tiempo de ejecución: " + (endTime - startTime) + " ms");
    }

    private static int[] generarNumerosAleatorios(int min, int max, int cantidad) {
        int[] numeros = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            numeros[i] = (int) (Math.random() * (max - min + 1)) + min;
        }
        return numeros;
    }
}
