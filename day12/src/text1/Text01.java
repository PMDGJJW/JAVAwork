package text1;

import org.omg.CORBA.Object;

import java.util.ArrayList;
import java.util.Iterator;

public class Text01 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        list.add("abc4");
        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
