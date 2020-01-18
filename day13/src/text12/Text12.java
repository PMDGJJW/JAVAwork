package text12;

import java.util.ArrayList;
import java.util.HashSet;

public class Text12 {

    public static void main(String[] args) {
        String arr[]={"abc","bad","abc","aab","bad","cef","jhi"};
        ArrayList<String> list = new ArrayList<>();
        HashSet<String> hset = new HashSet<>();
        for (String str :arr){
            hset.add(str);
        }
        list.addAll(hset);
        for (String str2 :list){
            System.out.println(str2);
        }
    }
}
