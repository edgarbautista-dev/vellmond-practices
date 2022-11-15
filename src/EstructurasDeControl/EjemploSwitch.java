package EstructurasDeControl;

public class EjemploSwitch {
    public static void main(String[] args){
        int numero=2;
        String numeroTexto="Numero desconocido";
        switch(numero){
            case 1:
                numeroTexto="Numero uno";
                break;
            case 2:
                numeroTexto="Numero dos";
                break;
            case 3:
                numeroTexto="Numero tres";
                break;
            default:
                numeroTexto="Caso no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }
}
