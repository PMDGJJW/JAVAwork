package text2;

import java.util.LinkedList;

public class Text02 {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("afirst");
        list.addFirst("alast");
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
    }
}
