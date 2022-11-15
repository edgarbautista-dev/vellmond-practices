package threads.producersconsumers;

import java.util.Random;

public class VellmondConsumer extends Thread {
    private VellmondResource resource;
    public VellmondConsumer(VellmondResource resource, String name) {
        super(name);
        this.resource = resource;
    }
    @Override
    public void run(){
        while(true){
            int value = resource.consume();
            System.out.printf("Hilo %s consumio %d \n",getName(),value);
            try {
                Thread.sleep(new Random().nextInt(200));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
