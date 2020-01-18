package text7;

import java.util.HashMap;
import java.util.Scanner;

public class Text7 {

    public  static  void  findchar(String s){
        String [] strarr = s.split(" ");
        HashMap<String,Integer> map = new HashMap<>();
       for (String s1 : strarr){
           if (!map.containsKey(s1)){
               map.put(s1,1);
           }
           else {
               Integer num = map.get(s1);
               map.put(s1,++num);
           }
       }
        System.out.println(map);
    }

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        String str = i.nextLine();
        findchar(str);
    }
}
