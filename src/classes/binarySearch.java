package classes;

public class binarySearch {
    public static void main(String[] args){
        int[] arrayNumbers={2,3,5,7,9,11,13,14,17,22};
        int valorBuscado=7;
        int indice=binarySearch(arrayNumbers,valorBuscado);
        if(indice!=-1){
            System.out.println("El valor buscado "+valorBuscado+" se encuentra en el indice "+indice);
        }else {
            System.out. println("El valor buscado: "+valorBuscado+" no se encuentra en el arreglo");
        }
    }

    public static int binarySearch(int[] array, int valorBuscado){
        int inicio=0;
        int fin=array.length-1;
        while(inicio<=fin){
            int medio=(inicio+fin)/2;
            if (array[medio]==valorBuscado) {
                return medio;
            }else if(array[medio]<valorBuscado){
                inicio=medio+1;
            } else if(array[medio]>valorBuscado){
                fin=medio-1;
            }
        }
        return -1;
    }

   /* public static void main(String[] args){
        int[] arrayNumbers= {2,4,6,8,10,12,14,16,18,20};
        int valorBuscado= 14;
        int indice= binarySearch(arrayNumbers,valorBuscado);
        if (indice != -1) {
            System.out.println("el valor buscado "+valorBuscado+" se encuentra en el indice "+indice);
        }else {
            System.out.println("el valor buscado no se encuentra en el arreglo");
        }
    }
    public static int binarySearch(int[] array, int value){
        int inicio=0;
        int fin=array.length-1;
        while(inicio<=fin){
            int medio=(inicio+fin)/2;
            if(array[medio]==value) {
                return medio;
            } else if (array[medio] < value) {
                inicio=medio+1;
            }else if(array[medio]>value){
                fin=medio-1;
            }
        }
        return -1; //el elemento no se encuentra en el arreglo

    }*/
}
