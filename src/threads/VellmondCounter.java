package threads;

class Counter implements Runnable {
    private int valor;

    public Counter(int valor) {
        this.valor = valor;
    }

    @Override
    public void run() {
        for(int i = valor; i >=0; i--) {
            System.out.printf("Hilo %s indice %d \n",Thread.currentThread().getName(),i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

public class VellmondCounter {
    public static void main(String[] args) {
        Thread hilo = new Thread(new Counter(10),"Hilo 1");
        Thread hilo2 = new Thread(new Counter(5),"Hilo 2");
        hilo.start();
        hilo2.start();
    }
}
