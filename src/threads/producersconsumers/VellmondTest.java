package threads.producersconsumers;

public class VellmondTest {
    public static void main(String[] args) throws InterruptedException {
        VellmondResource resource = new VellmondResource();
        VellmondConsumer consumer1 = new VellmondConsumer(resource, "Consumer 1");
        VellmondConsumer consumer2 = new VellmondConsumer(resource, "Consumer 2");
        VellmondProducer producer1 = new VellmondProducer(resource, "Producer 1");
        VellmondProducer producer2 = new VellmondProducer(resource, "Producer 2");
        producer1.start();
        producer2.start();
        Thread.sleep(1000);
        consumer1.start();
        consumer2.start();
    }
}
