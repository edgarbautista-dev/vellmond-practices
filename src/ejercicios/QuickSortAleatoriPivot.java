package ejercicios;

public class QuickSortAleatoriPivot {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1,22,6};
        quickSort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void quickSort(int[] array, int left, int right) {
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
