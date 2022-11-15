package collections;

import java.util.LinkedList;

public class EjemploLinkedList {
    public static void main(String[] args){
        LinkedList<String> linkedList = new LinkedList();
        linkedList.add("Edgar");
        linkedList.add("Juan");
        linkedList.add("Maria");
        System.out.println(linkedList.peek());
        System.out.println(linkedList.poll());
        System.out.println(linkedList);
    }
}
