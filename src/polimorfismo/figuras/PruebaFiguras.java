package polimorfismo.figuras;

public class PruebaFiguras {
    void imprimirArea(Figura f){
        System.out.println("El  color de la figura es: "+f.getColor()+" y su area es: "+f.calcularArea());
    }
    public static void main(String[] args) {
        PruebaFiguras pf=new PruebaFiguras();
        pf.imprimirArea(new Circulo("rojo", 10.0));
        pf.imprimirArea(new Cuadro("verde", 125.2));
        pf.imprimirArea(new Rectangulo("azul", 10.0, 20.0));

    }
}
