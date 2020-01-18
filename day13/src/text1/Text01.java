package text1;

import java.util.LinkedList;

public class Text01 {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("a1");
        list.add("a2");
        list.add("a3");
        list.add("a4");
        list.add("a5");
        for (Object STR :list){
            System.out.println(STR);
        }
        list.set(2,"b3");
        list.add(3,"b4");
        System.out.println(list.get(3));
        System.out.println(list.size());
        System.out.println(list.remove(4));

    }
}
