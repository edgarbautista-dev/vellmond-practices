package threads.producersconsumers;

import java.util.Random;

public class VellmondProducer extends Thread {
    private VellmondResource resource;
    public VellmondProducer(VellmondResource resource, String name) {
        super(name);
        this.resource = resource;
    }
    @Override
    public void run(){
        while(true){
            try {
                int value = new Random().nextInt(1000);
                System.out.printf("Hilo %s produjo %d \n",getName(),value);
                resource.produce(value);
                Thread.sleep(new Random().nextInt(300));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
