package threads;
class SyncCounter {
  static int counter = 10;

  public static void decrement() {
    counter--;
    System.out.println("Counter: " + counter);
  }
}

class Decrementor extends Thread{
    @Override
    public void run(){
        System.out.println("Decrementando SyncCounter");
        SyncCounter.decrement();
    }
}

public class EjemploSincronizacion {
    public static void main(String[] args) {
        for( int i=0;i<10;i++){
            new Decrementor().start();
        }
    }
}

