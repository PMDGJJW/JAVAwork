package demo2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Demo2 {

    public static void main(String[] args) {
        HashMap<String,String> hmap = new HashMap<>();
        hmap.put("大古","迪迦");
        hmap.put("我梦","盖亚");
        hmap.put("飞鸟","高斯");
        Set<String> keys = hmap.keySet();
      for (String KEY :keys){
          String value = hmap.get(KEY);
          System.out.println(KEY+"可变成"+value);
      }
    }
}
