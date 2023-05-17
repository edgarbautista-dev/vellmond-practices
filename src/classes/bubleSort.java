package classes;

public class bubleSort {
    public static void main(String[] args){
        int[] arrayNumbers ={6,3,8,1,9,4,7,5,2};
        System.out.println("Arreglo sin ordenar");
        printArray(arrayNumbers);
        System.out.println("Arreglo ordenado");
        bubleSort(arrayNumbers);
        printArray(arrayNumbers);
    }

    public static void bubleSort(int[] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    //intercambiar los elementos si estan en orden incorrecto
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }

    public static void printArray(int[] array){
        String result = "";
        for(int numbers:array){
            result+=numbers+" ";
        }
        System.out.println(result);
    }
}
