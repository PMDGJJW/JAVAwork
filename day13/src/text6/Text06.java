package text6;

import java.util.ArrayList;
import java.util.Collections;

public class Text06 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(33);
        list.add(11);
        list.add(77);
        list.add(55);
        Collections.sort(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println("reverse");
        for (Integer rev : list){
            System.out.println(rev);
        }
    }
}
