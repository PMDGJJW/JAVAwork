package text6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Text6 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("bcd");
        HashMap<Character,Integer> map = new HashMap<>();

        for (String str : list){
          char[] i = str.toCharArray();
            for (int j = 0; j <i.length ; j++) {
               if (!map.containsKey(i[j])){
                   map.put(i[j],1);
               }
               else {

                   Integer num = map.get(i[j]);
                   map.put(i[j],++num);
               }
            }
            System.out.println(map);
        }

    }
}
