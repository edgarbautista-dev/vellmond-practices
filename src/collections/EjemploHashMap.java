package collections;

import java.util.HashMap;

public class EjemploHashMap {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Edgar", "Es el developer");
        hashMap.put("Juan", "es otro developer");
        hashMap.put("Maria", "es la tester");
        hashMap.put(null, "representa a un valor nulo");
        System.out.println("Edgar".hashCode());
        System.out.println(hashMap);
        for (String key : hashMap.keySet()) {
            System.out.println(key + " = " + hashMap.get(key));
        }
    }
}
