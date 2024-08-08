package threads;
 class ContadorNumerosPares extends Thread {
    public void run() {
        long startTime = System.currentTimeMillis();
        int count = 0;
        for (int i = 1; i <= 1000000; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Cantidad de números pares: " + count);
        System.out.println("Tiempo transcurrido (milisegundos): " + (endTime - startTime));
    }
}

 class ContadorNumerosImpares extends Thread {
    public void run() {
        long startTime = System.currentTimeMillis();
        int count = 0;
        for (int i = 50; i <= 1236543; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Cantidad de números impares: " + count);
        System.out.println("Tiempo transcurrido (milisegundos): " + (endTime - startTime));
    }
}

public class countThreadsNumbers {
    public static void main(String[] args) {
        ContadorNumerosPares hiloPares = new ContadorNumerosPares();
        ContadorNumerosImpares hiloImpares = new ContadorNumerosImpares();

        hiloPares.start();
        hiloImpares.start();
    }
}
