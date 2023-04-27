package lambdas.custom;

public class PruebaCalculable {
    public static void main(String[] args){
        //Creacion con clases anonimas
        Calculable calculable = new Calculable() {
            @Override
            public double avg(double ...values) {
                double sum = 0.0;
                for(double value : values){
                    sum += value;
                }
                return sum / values.length;
            }
        };
        Calculable calculable2 = (numbers) -> {
            double sum = 0.0;
            for(double value : numbers){
                sum += value;
            }
            return sum / numbers.length;
        };
        System.out.println(calculable.avg(10,20,30));
        System.out.println(calculable2.avg(10,20,30));
    }
}
