package hcl;

import java.util.*;

public class playWithLists {
    public static void main(String[] args){
        //Arreglo de enteros inicializado con valores 1,2,3,4
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,2,1));
        int[] arr = {1,2,3,4};
        int[] arr2 = {1,2,3};
        int[] arr3 = {1,2,3,2,1};
        //otra forma de inicializar un Map
        Map<Integer, Integer> map = new HashMap<Integer, Integer>() {{
            put(1, 100);
            put(2, 200);
            put(3, 300);
        }};
        Map<Integer, Integer> map2 = new HashMap<Integer, Integer>(){{
            put(1,100);
            put(2,200);
            put(3,300);
        }};




        //Lista de numero impares
        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,3,5,7,9));
        System.out.println("La lista 1 tiene los mismos valores que la lista 2: "+hasSameValues(list1, list2));
        System.out.println("La lista 1 tiene los mismos valores que la lista 3: "+hasSameValues(list1, list3));
        System.out.println("La lista 3 tiene solo numeros impares: "+isOnlyOdd(list3));
        System.out.println("La lista 4 tiene solo numeros impares: "+isOnlyOdd(list4));
        System.out.println("El arreglo 1 tiene los mismos valores que el arreglo 2: "+hasSameValues(arr, arr2));
        System.out.println("El arreglo 1 tiene los mismos valores que el arreglo 3: "+hasSameValues(arr, arr3));
        System.out.println("El mapa 1 tiene los mismos valores que el mapa 2: "+hasSameValues(map, map2));

    }
    //verificar si dos listas tienen los mismos valores sin importar el orden de forma optima
    public static boolean hasSameValues(List<Integer> list1, List<Integer> list2){
           if(list1.size()!=list2.size()){
                return false;
            }
            for(Integer n:list1){
                if(!list2.contains(n)){
                    return false;
                }
            }
            return true;
            //esta es la forma optima de hacerlo ya que el metodo contains de una lista es O(n)
    }

    public static boolean isOnlyOdd(List<Integer> list){
        for(Integer n:list){
            if(n%2==0){
                return false;
            }
        }
        return true;
    }

    public static boolean hasSameValues(int[] arr1, int[] arr2){
        if(arr1.length!=arr2.length){
            return false;
        }
        for(int n:arr1){
            boolean found=false;
            for(int m:arr2){
                if(n==m){
                    found=true;
                    break;
                }
            }
            if(!found){
                return false;
            }
        }
        return true;
    }

    public static boolean hasSameValues(Map<Integer, Integer> map1, Map<Integer, Integer> map2){
        if(map1.size()!=map2.size()){
            return false;
        }
        for(Map.Entry<Integer, Integer> entry: map1.entrySet()){
            if(!map2.containsKey(entry.getKey()) || map2.get(entry.getKey())!=entry.getValue()){
                return false;
            }
        }
        return true;
    }

}

3330444005
