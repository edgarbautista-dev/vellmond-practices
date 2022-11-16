package herencia;

public class Estudiante  extends Persona{
    String matricula;
    String carrera;
    Estudiante(String nombre, String fechaDeNacimiento, String matricula, String carrera) {
        super(nombre, fechaDeNacimiento);
        this.matricula = matricula;
        this.carrera = carrera;
    }

    void Estudiar() {
        System.out.println("Soy " + nombre + " y estoy estudiando");
    }
    @Override
    void Dormir() {
        super.Dormir();// para llamar el metodo original de la clase padre
        System.out.println("Soy " + nombre + " y estoy durmiendo en la casa");
    }
    void Respirar() {
        System.out.println("Soy " + nombre + " y estoy respirando desde " + fechaDeNacimiento + " en la biblioteca");
    }
    void Comer() {
        System.out.println("Soy " + nombre + " y estoy comiendo en la biblioteca");
    }
}
