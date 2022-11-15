package innerclasses;

abstract class FiguraAnonima {
    abstract void foo();
}

public class EjemploAnonimasAbstractas {
    public static void main(String[] args){
        FiguraAnonima figuraAnonima = new FiguraAnonima() {
            @Override
            void foo() {
                System.out.println("Hola desde la clase anonima");
            }
        };
        figuraAnonima.foo();
    }
}
