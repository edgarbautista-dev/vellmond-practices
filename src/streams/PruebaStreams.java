package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Persona{
    private String nombre;
    private int edad;
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }

    @Override
    public String toString(){
        return nombre + " " + edad;
    }
}
public class PruebaStreams {
    public static void main(String[] args){
        List<Persona> personas = Arrays.asList(
            new Persona("Juan", 10),
            new Persona("Pedro", 30),
            new Persona("Luis", 32),
            new Persona("Carlos", 18),
            new Persona("Ana", 52),
            new Persona("Maria", 11),
            new Persona("Luisa", 9)
        );
        /*
        List<Persona> result = new ArrayList<>();
        int count=0;
        for(Persona p : personas){
            if(p.getEdad() >= 18){
                result.add(p);
                count++;
            }
            if(count ==3){
                break;
            }
        }*/
        List<Persona> result = personas.stream().filter(p -> p.getEdad() >= 18).limit(3).collect(Collectors.toList());
        System.out.println(result);
    }
}
