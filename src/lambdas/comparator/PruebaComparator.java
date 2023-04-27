package lambdas.comparator;

import java.util.Set;
import java.util.TreeSet;

public class PruebaComparator {
    public static void main(String[] args) {
        NombrePersonaComparator comparator = new NombrePersonaComparator();
        Set<Persona> personas = new TreeSet<>(comparator);

        personas.add(new Persona("Edgar", "Bautista", 25));
        personas.add(new Persona("Juan", "Perez", 30));
        personas.add(new Persona("Maria", "Gonzalez", 20));
        System.out.println(personas);
    }
}
