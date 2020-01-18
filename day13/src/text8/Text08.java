package text8;

import java.util.ArrayList;
import java.util.HashSet;

public class Text08 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("f");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("d");
        HashSet HST = new HashSet();
        for (String str :list){
            HST.add(str);
        }
        list.clear();
        list.addAll(0,HST);
        for (String str2:list){
            System.out.println(str2);
        }
    }


}
