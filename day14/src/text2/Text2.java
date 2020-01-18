package text2;

import java.util.HashMap;
import java.util.Set;

public class Text2 {

    public static void main(String[] args) {
        HashMap<String,Integer> hmap = new HashMap<>();
        hmap.put("柳岩",2100);
        hmap.put("张亮",1700);
        hmap.put("诸葛亮",1800);
        hmap.put("灭绝师太",2600);
        hmap.put("东方不败 ",3800);
        System.out.println(hmap);
        int price = hmap.get("柳岩");
        price+=300;
        hmap.remove("柳岩");
        hmap.put("柳岩",price);
        Set<String> hset = hmap.keySet();
        for (String key :hset){
            System.out.println(key+"  "+hmap.get(key));
        }
    }
}
