package herencia;

public class Empleado extends Persona{
    String puesto;
    float salario;

    Empleado(String nombre, String fechaDeNacimiento, String puesto, float salario) {
        super(nombre, fechaDeNacimiento);
        this.puesto = puesto;
        this.salario = salario;
    }

    void Trabajar() {
        System.out.println("Soy " + nombre + " y estoy trabajando");
    }
    void Dormir() {
        System.out.println("Soy " + nombre + " y estoy durmiendo en la oficina");
    }
    void Respirar() {
        System.out.println("Soy " + nombre + " y estoy respirando desde " + fechaDeNacimiento + " en la oficina");
    }
    void Comer() {
        System.out.println("Soy " + nombre + " y estoy comiendo en la oficina");
    }
}
