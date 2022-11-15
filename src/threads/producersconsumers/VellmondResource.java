package threads.producersconsumers;

import java.util.LinkedList;

public class VellmondResource {
    private LinkedList<Integer> resources = new LinkedList<>();

    public synchronized int consume() {
        while (resources.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return resources.poll();
    }

    public synchronized void produce(int value) {
        resources.offer(value);
        notifyAll();
    }
}
