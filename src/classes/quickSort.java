package classes;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args){
        int[] arrayNumbers={8,2,6,1,5,9,0,4};
        System.out.println("Arreglo original");
        printArray(arrayNumbers);
        System.out.println("Arreglo final");
        quickSort(arrayNumbers,0,arrayNumbers.length-1);
        printArray(arrayNumbers);
    }

    public static void quickSort(int[] array,int low, int high){
        if(low<high){
            int pi= partition(array,low,high);
            quickSort(array,low,pi-1);
            quickSort(array,pi+1,high);
        }
    }

    public static int partition(int[] arrayPartition, int low, int high){
        int pivot=arrayPartition[high];
        int i=(low-1);
        for(int j =low;j<high;j++){
            if(arrayPartition[j]<pivot){
                i++;
                int temp=arrayPartition[i];
                arrayPartition[i]=arrayPartition[j];
                arrayPartition[j]=temp;
            }
        }
        int temp=arrayPartition[i+1];
        arrayPartition[i+1]=arrayPartition[high];
        arrayPartition[high]=temp;

        return i+1;
    }

    public static void printArray(int[] array){
        String result="";
        for(int numbers: array){
            result+=numbers+" ";
        }
        System.out.println(result);
    }
}
