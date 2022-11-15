package collections;

import java.util.PriorityQueue;
/**
 * PriorityQueue
 * Implementa una cola de prioridad basada en una cola de heap.
 * para imprimir el orden natural de los elementos de la cola de prioridad
 * @author Edgar
 */
public class EjemploPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue();
        priorityQueue.add(1000);
        priorityQueue.add(200);
        priorityQueue.add(5);
        priorityQueue.add(100);
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue);
    }
}
