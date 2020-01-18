package demo6;

import java.security.Key;
import java.util.HashMap;
import java.util.Scanner;

public class Demo6 {

    public  static  void findchar(String line){
        HashMap <Character,Integer> hmap = new HashMap<>();
        for (int i = 0; i <line.length() ; i++) {
            char ca = line.charAt(i);
            if (!hmap.containsKey(ca)){
                hmap.put(ca,1);
            }
            else {
                Integer num = hmap.get(ca);
                hmap.put(ca,++num);
            }
        }
        System.out.println(hmap);
    }
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        String str = i.next();
        findchar(str);
    }
}
