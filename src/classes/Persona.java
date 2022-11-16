package classes;

public class Persona {
    //Atributos
    String nombre;
    char sexo;
    int edad;
    Persona(){
        System.out.println("Se ha creado una persona");
    }
    Persona(String nombre, char sexo, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
    }

    //Metodos
    void jugarVideoJuegos(Persona p) {
        System.out.println(nombre + " esta jugando videojuegos con " + p.nombre);
    }
    void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
    }
    public static void main(String[] args) {
        Persona persona = new Persona("Edgar", 'M', 34);
        persona.imprimirInformacion();
        Persona p1= new Persona();
        p1.nombre = "Juan";
        p1.edad = 18;
        p1.sexo = 'M';
        p1.imprimirInformacion();
        persona.jugarVideoJuegos(p1);
    }
}