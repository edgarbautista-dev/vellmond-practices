package threads.ejerciciopracticas;

import java.util.Random;

class VellmondTemporizador extends Thread{
    private int segundos;
    public VellmondTemporizador(int segundos) {
        this.segundos = segundos;
    }
    @Override
    public void run() {
        for(int i = segundos; i >= 0; i--) {
            System.out.printf("Hilo %s indice %d \n",getName(),i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class temporizador {
    public static void main(String[] args) {
        VellmondTemporizador vellmondTemporizador1 = new VellmondTemporizador(new Random().nextInt(10));
        VellmondTemporizador vellmondTemporizador2 = new VellmondTemporizador(new Random().nextInt(10));
        VellmondTemporizador vellmondTemporizador3 = new VellmondTemporizador(new Random().nextInt(10));
        VellmondTemporizador vellmondTemporizador4 = new VellmondTemporizador(new Random().nextInt(10));
        VellmondTemporizador vellmondTemporizador5 = new VellmondTemporizador(new Random().nextInt(10));
        VellmondTemporizador vellmondTemporizador6 = new VellmondTemporizador(new Random().nextInt(10));
        VellmondTemporizador vellmondTemporizador7 = new VellmondTemporizador(new Random().nextInt(10));
        VellmondTemporizador vellmondTemporizador8 = new VellmondTemporizador(new Random().nextInt(10));
        VellmondTemporizador vellmondTemporizador9 = new VellmondTemporizador(new Random().nextInt(10));
        VellmondTemporizador vellmondTemporizador10 = new VellmondTemporizador(new Random().nextInt(10));
        vellmondTemporizador1.start();
        vellmondTemporizador2.start();
        vellmondTemporizador3.start();
        vellmondTemporizador4.start();
        vellmondTemporizador5.start();
        vellmondTemporizador6.start();
        vellmondTemporizador7.start();
        vellmondTemporizador8.start();
        vellmondTemporizador9.start();
        vellmondTemporizador10.start();
    }
}
