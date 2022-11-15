package innerclasses;

abstract interface Jugable{
    abstract void jugar();
}

public class EjemploInterfacesAnonimas {
    public static void main(String[] args){
        Jugable jugable = new Jugable() {
            @Override
            public void jugar() {
                System.out.println("Jugando desde la clase anonima");
            }
        };
        jugable.jugar();
    }
}
