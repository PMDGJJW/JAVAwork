package text8;

import java.util.ArrayList;
import java.util.Iterator;

public class Text08 {

    public static<E> void swap(Integer a,Integer b,ArrayList<E> str){
        E temp = str.get( a);
        str.set(a,str.get(b));
        str.set(b,temp);

            System.out.println(str);

    }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        ArrayList<Integer> intlist = new ArrayList<>();
        intlist.add(1);
        intlist.add(2);
        intlist.add(3);
        intlist.add(4);
        swap(0,2,list);
    }
}
