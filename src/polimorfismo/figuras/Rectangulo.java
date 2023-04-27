package polimorfismo.figuras;

public class Rectangulo extends Figura{
    private final double base;
    private final double altura;

    public Rectangulo(String color, double base, double altura){
        super(color);
        this.base=base;
        this.altura=altura;
    }

    @Override
    public double calcularArea(){
        return base*altura;
    }
}
