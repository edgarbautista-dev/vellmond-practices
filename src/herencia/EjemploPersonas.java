package herencia;

public class EjemploPersonas {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Edgar", "1989", "123456", "Ingenieria");
        estudiante.Estudiar();
        estudiante.Dormir();
        estudiante.Respirar();
        estudiante.Comer();
        Empleado empleado = new Empleado("Juan", "1990", "Programador", 10000);
        empleado.Trabajar();
        empleado.Dormir();
        empleado.Respirar();
        empleado.Comer();
    }
}
