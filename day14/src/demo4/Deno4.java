package demo4;

import java.util.HashMap;
import java.util.Set;

public class Deno4 {

    public static void main(String[] args) {
        HashMap<Person,String> hmap = new HashMap<>();
        hmap.put(new Person("小明",20),"上海");
        hmap.put(new Person("小强",22),"北京");
        hmap.put(new Person("小奎",24),"深圳");
        hmap.put(new Person("小浩",21),"广州");
        Set<Person>  set = hmap.keySet();
        System.out.println(set);
        for (Person key : set){
            String value = hmap.get(key);
            System.out.println(key+"---"+value);
        }
    }
}
