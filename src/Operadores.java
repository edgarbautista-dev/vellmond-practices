public class Operadores {
    public static void main(String[] args){
        //operadores aritmeticos
        int suma=10+20;
        System.out.println("suma = "+suma);
        int resta=20-10;
        System.out.println("resta = "+resta);
        int multiplicacion=10*20;
        System.out.println("multiplicacion = "+multiplicacion);
        int division=20/10;
        System.out.println("division = "+division);
        int modulo=20%10;
        System.out.println("modulo = "+modulo);
        int incremento=10;
        incremento++;
        System.out.println("incremento = "+incremento);
        int decremento=10;
        decremento--;
        System.out.println("decremento = "+decremento);
        int negacion=10;
        negacion=-negacion;
        System.out.println("negacion = "+negacion);
        //operadores de asignacion
        int asignacion=10;
        System.out.println("asignacion = "+asignacion);
        int asignacionSuma=10;
        asignacionSuma+=5;
        System.out.println("asignacionSuma = "+asignacionSuma);
        int asignacionResta=10;
        asignacionResta-=5;
        System.out.println("asignacionResta = "+asignacionResta);
        int asignacionMultiplicacion=10;
        asignacionMultiplicacion*=5;
        System.out.println("asignacionMultiplicacion = "+asignacionMultiplicacion);
        int asignacionDivision=10;
        asignacionDivision/=5;
        System.out.println("asignacionDivision = "+asignacionDivision);
        int asignacionModulo=10;
        asignacionModulo%=5;
        System.out.println("asignacionModulo = "+asignacionModulo);
        //operadores de comparacion
        int comparacion1=10;
        int comparacion2=10;
        System.out.println("comparacion1 == comparacion2 = "+(comparacion1 == comparacion2));
        System.out.println("comparacion1 != comparacion2 = "+(comparacion1 != comparacion2));
        System.out.println("comparacion1 > comparacion2 = "+(comparacion1 > comparacion2));
        System.out.println("comparacion1 < comparacion2 = "+(comparacion1 < comparacion2));
        System.out.println("comparacion1 >= comparacion2 = "+(comparacion1 >= comparacion2));
        System.out.println("comparacion1 <= comparacion2 = "+(comparacion1 <= comparacion2));
        //operadores logicos
        boolean comparacion3=true;
        boolean comparacion4=false;
        System.out.println("comparacion3 && comparacion4 = "+(comparacion3 && comparacion4));
        System.out.println("comparacion3 || comparacion4 = "+(comparacion3 || comparacion4));
        System.out.println("!comparacion3 = "+(!comparacion3));
        System.out.println("!comparacion4 = "+(!comparacion4));
        //operadores de bit a bit
        int bit1=10;
        int bit2=20;
        System.out.println("bit1 & bit2 = "+(bit1 & bit2));
        System.out.println("bit1 | bit2 = "+(bit1 | bit2));
        System.out.println("bit1 ^ bit2 = "+(bit1 ^ bit2));
        System.out.println("~bit1 = "+(~bit1));
        System.out.println("bit1 << 2 = "+(bit1 << 2));
        System.out.println("bit1 >> 2 = "+(bit1 >> 2));
        System.out.println("bit1 >>> 2 = "+(bit1 >>> 2));
        //operadores ternarios
        int ternario1=10;
        int ternario2=20;
        int resultado=ternario1>ternario2?ternario1:ternario2;
        System.out.println("resultado = "+resultado);
        //operadores de instancia
        String instancia1="hola";
        String instancia2="hola";
        System.out.println("instancia1 instanceof String = "+(instancia1 instanceof String));
        System.out.println("instancia2 instanceof String = "+(instancia2 instanceof String));
        //operadores de casteo
        int casteo1=10;
        long casteo2=casteo1;
        System.out.println("casteo2 = "+casteo2);
        long casteo3=10;
        int casteo4=(int)casteo3;
        System.out.println("casteo4 = "+casteo4);
        //operadores de asignacion compuesta
        int asignacionCompuesta1=10;
        int asignacionCompuesta2=20;
        asignacionCompuesta1+=asignacionCompuesta2;
        System.out.println("asignacionCompuesta1 = "+asignacionCompuesta1);
        asignacionCompuesta1-=asignacionCompuesta2;
        System.out.println("asignacionCompuesta1 = "+asignacionCompuesta1);
        asignacionCompuesta1*=asignacionCompuesta2;
        System.out.println("asignacionCompuesta1 = "+asignacionCompuesta1);
        asignacionCompuesta1/=asignacionCompuesta2;
        System.out.println("asignacionCompuesta1 = "+asignacionCompuesta1);
        asignacionCompuesta1%=asignacionCompuesta2;
        System.out.println("asignacionCompuesta1 = "+asignacionCompuesta1);
        asignacionCompuesta1&=asignacionCompuesta2;
        System.out.println("asignacionCompuesta1 = "+asignacionCompuesta1);
        asignacionCompuesta1|=asignacionCompuesta2;
        System.out.println("asignacionCompuesta1 = "+asignacionCompuesta1);
        asignacionCompuesta1^=asignacionCompuesta2;
        System.out.println("asignacionCompuesta1 = "+asignacionCompuesta1);
        asignacionCompuesta1<<=asignacionCompuesta2;
        System.out.println("asignacionCompuesta1 = "+asignacionCompuesta1);
        asignacionCompuesta1>>=asignacionCompuesta2;
        System.out.println("asignacionCompuesta1 = "+asignacionCompuesta1);
        asignacionCompuesta1>>>=asignacionCompuesta2;
        System.out.println("asignacionCompuesta1 = "+asignacionCompuesta1);

    }
}
