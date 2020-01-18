package text11;

import java.util.*;

public class Text11 {

    public static void main(String[] args) {
        HashMap<String,String> map  = new HashMap<>();
        HashMap<String,String> map1  = new HashMap<>();
        map.put("001","李晨");
        map.put("002","范冰冰");
        map1.put("001","马云");
        map1.put("002","马化腾");
        HashMap<String,HashMap<String,String>> classmap = new HashMap<>();
        classmap.put("java基础班",map);
        classmap.put("java就业班",map1);
        System.out.println("----------------用keySet和增强for遍历-------------------------");
        Set<String> set = classmap.keySet();
        for (String key : set){
            System.out.println(key+"\n"+classmap.get(key));
        }
        System.out.println("----------entrySet和迭代器遍历---------------");
       Set<Map.Entry<String,HashMap<String,String>>> classset = classmap.entrySet();
        Iterator <Map.Entry<String,HashMap<String,String>>> it = classset.iterator();
        while (it.hasNext()){
            Map.Entry<String,HashMap<String,String>> st = it.next();
            String ST = st.getKey();
            HashMap<String,String> value = st.getValue();
            System.out.println(ST+" \n"+value);
        }

    }
}
