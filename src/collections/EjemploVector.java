package collections;

import java.util.Vector;

public class EjemploVector {
    public static void main(String[] args) {
        //Es thread safe ya que su metodo add es sincronizado
        Vector<String> vector = new Vector();
        vector.add("Edgar");
        vector.add("Juan");
        vector.add("Maria");
        System.out.println(vector);
    }
}
