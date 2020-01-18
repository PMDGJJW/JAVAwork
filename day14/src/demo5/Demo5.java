package demo5;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Demo5 {

    public static void main(String[] args) {
        LinkedHashMap<String,String> lhmp = new LinkedHashMap<>();
        lhmp.put("aa","AA");
        lhmp.put("bb","BB");
        lhmp.put("cc","CC");
        lhmp.put("dd","DD");
        Set<Map.Entry<String,String>> hset = lhmp.entrySet();
        for (Map.Entry<String,String> key :hset){
            System.out.println(key.getKey()+" "+key.getValue());
        }
    }
}
