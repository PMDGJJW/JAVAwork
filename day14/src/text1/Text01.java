package text1;

import com.sun.xml.internal.bind.util.Which;

import javax.swing.*;
import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Text01 {
    public static void main(String[] args) {
        HashMap<String,String> hmap = new HashMap<>();
        while (hmap.size()<5){
            Scanner i = new Scanner(System.in);
            String stu = i.next();
            String [] six = stu.split(",");
            String name = six[0];
            String age = six[1];
            hmap.put(name,age);
        }
        Set <Map.Entry<String,String>> hset = hmap.entrySet();
       for (Map.Entry<String,String> key :hset){
           System.out.println("姓名 ："+key.getKey()+"   "+"年龄 : "+key.getValue());
       }
    }

}
