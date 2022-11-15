package EstructurasDeControl;

public class EjemploDoWhile {
    public static void main(String[] args){
        int contador=0;
        // mientras la expresion sea verdadera se ejecuta el bloque de codigo
        do{
            System.out.println("contador = "+contador);
            contador++;
        }while(contador<10);
    }
}