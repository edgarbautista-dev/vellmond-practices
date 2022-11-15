package EstructurasDeControl;

public class EjemploWhile {
    public static void main(String[] args){
        int contador=0;
        // mientras la expresion sea verdadera se ejecuta el bloque de codigo
        while(contador<10){
            System.out.println("contador = "+contador);
            contador++;
        }
    }
}