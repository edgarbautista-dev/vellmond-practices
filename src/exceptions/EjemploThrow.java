package exceptions;

public class EjemploThrow {
    /* Manejar la excepcion sera una de dos cosas:
     * 1. atraparla con un bloque try-catch
     * 2. Propagar a quien invoco el metodo
     *  @throws Exception
     */
    static  double  dividir ( int  a,  int  b )  throws  Exception {
        if ( b ==  0 ) {
            throw  new  Exception ( "No se puede dividir por cero" );
        }
        return  a / b;
    }
    public static void main(String[] args) throws Exception {
     double resultado = dividir(10, 2);
        System.out.println("Resultado"+resultado);
    }
}
