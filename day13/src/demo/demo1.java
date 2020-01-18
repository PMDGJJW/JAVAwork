package demo;

import java.util.LinkedList;

public class demo1 {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("a1");
        linkedList.addFirst("a2");
        linkedList.addFirst("a3");
        linkedList.addFirst("a4");
        linkedList.addFirst("a5");
        System.out.println(linkedList);
        System.out.println(linkedList.get(2));
        linkedList.set(2,"bbb");
        System.out.println("-----------------------------");
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println("-----------------------------");
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);
        System.out.println("-----------------------------");
        System.out.println(linkedList.isEmpty());

    }
}
