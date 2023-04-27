package collections;

import java.util.ArrayList;

public class EjemploArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("Edgar");
        arrayList.add("Jesus");
        arrayList.add("Bautista");
        for(String nombre: arrayList){
            System.out.println(nombre);
        }

    }
}
