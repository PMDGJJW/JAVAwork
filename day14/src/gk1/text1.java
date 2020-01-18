package gk1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class text1 {

    public static void main(String[] args) {
        HashMap<student,String> map = new HashMap<>();
        map.put(new student("张三",25),"广州");
        map.put(new student("张四",25),"上海");
        map.put(new student("张五",25),"北京");
        System.out.println("------------Entry方法的循环---------------------");
        Set<Map.Entry<student,String>> set = map.entrySet();
        for (Map.Entry<student,String> keys : set ){
            System.out.println(keys.getKey()+"家住在"+keys.getValue());
        }
        Iterator <Map.Entry<student,String>>it = set.iterator();
        while (it.hasNext()){
            Map.Entry<student,String> kit = it.next();
            System.out.println(kit.getKey()+"家住在"+kit.getValue());
        }
        System.out.println("---------ketset的循环---------------");
        Set<student> kset = map.keySet();
        for (student kkeys : kset){
            System.out.println(kkeys+" 家住在 "+map.get(kkeys));
        }
        Iterator<student> kit = kset.iterator();
        while (kit.hasNext()){
          student s1 = kit.next();
            System.out.println(s1+" 家住在 "+map.get(s1));
        }
    }
}
