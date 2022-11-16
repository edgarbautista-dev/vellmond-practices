package herencia;

public class Persona {
    String nombre;
    String fechaDeNacimiento;

    Persona(String nombre, String fechaDeNacimiento) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    void Dormir() {
        System.out.println("Soy " + nombre + " y estoy durmiendo");
    }
    void Respirar() {
        System.out.println("Soy " + nombre + " y estoy respirando desde " + fechaDeNacimiento);
    }
    void Comer() {
        System.out.println("Soy " + nombre + " y estoy comiendo");
    }
}
