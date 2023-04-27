package lambdas.comparator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class PruebaComparatorLambda {
    @SuppressWarnings("unused")
    public static void main(String[] args){
        /*
        Al implementar la interfaz Comparator, se debe implementar el metodo compare
        pero al usar lambdas el metodo compareTo se implementa automaticamente
         */
        Comparator<Persona> comparator = (o1,o2)->o1.getApellido().compareTo(o2.getApellido());
        Comparator<Persona> comparatorPorEdad = new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                return o1.getEdad()-o2.getEdad();
            }
        };
        Set<Persona> personas = new TreeSet<>(comparator);
        personas.add(new Persona("Edgar", "Bautista", 25));
        personas.add(new Persona("Juan", "Perez", 30));
        personas.add(new Persona("Maria", "Gonzalez", 20));
        System.out.println(personas);

    }
}
