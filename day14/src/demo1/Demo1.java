package demo1;

import java.util.HashMap;

public class Demo1 {

    public static void main(String[] args) {
        HashMap<String,String> hmap = new HashMap<>();
        hmap.put("大古","迪迦");
        hmap.put("我梦","盖亚");
        hmap.put("飞鸟","高斯");
        System.out.println(hmap);
        System.out.println(hmap.get("大古"));
        System.out.println(hmap.get("飞鸟"));
        System.out.println(hmap.remove("大古"));
        System.out.println(hmap);
    }
}
