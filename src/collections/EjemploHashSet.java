package collections;

import java.util.HashSet;

public class EjemploHashSet {
    public static void main(String[] args) {
        HashSet<String> nombres = new HashSet<>();
        nombres.add("Edgar");
        nombres.add("Edgar");
        nombres.add("Maria");
        nombres.add(null);
        System.out.println(nombres);
    }

}