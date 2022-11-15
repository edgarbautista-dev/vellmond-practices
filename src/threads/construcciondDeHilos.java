package threads;

class VellmondThread extends Thread {
    public VellmondThread(String name) {
        super(name);
    }

    @Override
    public void run() {
      for(int i = 0; i < 100; i++) {
          System.out.printf("Hilo %s indice %d \n",getName(),i);
          try {
              Thread.sleep(100);
          } catch (InterruptedException e) {
              throw new RuntimeException(e);
          }
      }
    }
}

public class construcciondDeHilos {
    public static void main(String[] args) {
        VellmondThread vellmondThread = new VellmondThread("Hilo 1");
        VellmondThread vellmondThread2 = new VellmondThread("Hilo 2");
        vellmondThread.start();
        vellmondThread2.start();
    }
}
