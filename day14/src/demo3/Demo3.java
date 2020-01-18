package demo3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo3 {
    public static void main(String[] args) {
        HashMap<String,String> hmap = new HashMap<>();
        hmap.put("大古","迪迦");
        hmap.put("我梦","盖亚");
        hmap.put("飞鸟","高斯");
        Set<Map.Entry<String,String>> hset = hmap.entrySet();
        System.out.println(hset);
        for (Map.Entry<String,String> entry:hset){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"可变成"+value);
        }
    }
}
