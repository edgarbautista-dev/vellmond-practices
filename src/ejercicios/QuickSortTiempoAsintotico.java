package ejercicios;


/**
 * En esta actividad demostraremos de manera empírica que QuickSort es O(nlogn) cuando se elige el pivote de manera aleatoria.
 *
 * Programa el algoritmo de Quicksort con pivote aleatorio
 * Necesitaras una biblioteca de números seudoaleatorios
 * Genera arreglos de tamaño n=100, 250, 500, 750, 1000, 1250, 1500, 1750, 2000. De manera que cada uno de estos arreglos contenga los números naturales desde 0 hasta n-1.
 * Para cada uno de los arreglos anteriores realiza el siguiente proceso 50 veces:
 * Permuta de manera aleatoria el arreglo
 * Luego ordénalo con Quicksort, mide el tiempo que tarda este proceso y guárdalo.
 * Calcula la media para cada tamaño de n
 * Grafica los resultados, donde el eje “x” sea el tamaño del arreglo y el eje “y” sea el tiempo medio que tardó el algoritmo de Quicksort en ordenarlo.
 * Sobrepón dos gráficas una de k_1*n*log(n) y otra para k_2*n^2. Encuentra k_1 y k_2 de manera que las tres gráficas se intercepten cuando n=1000
 */
public class QuickSortTiempoAsintotico {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1,22,6};
        quickSort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    static void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int pivot = partition(array, left, right);
            quickSort(array, left, pivot - 1);
            quickSort(array, pivot + 1, right);
        }

    }

    private static int partition(int[] array, int left, int right) {
        int pivot = array[left];
        int i = left;
        int j = right;
        while (i < j) {
            while (array[i] <= pivot && i < j) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
    }
        array[left] = array[j];
        array[j] = pivot;
        return j;
    }
}

