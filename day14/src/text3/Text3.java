package text3;

import java.util.HashMap;

public class Text3 {

    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"张三丰");
        map.put(2,"周芷若");
        map.put(3,"汪峰");
        map.put(4,"灭绝师太");
        System.out.println(map);
        map.put(5,"李晓红");
        map.remove(1);
        String name = map.get(2);
        map.put(2,"周琳");
        System.out.println(map);
    }
}
