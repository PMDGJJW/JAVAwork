package text7;

import java.util.ArrayList;

public class Text07 {
    public static  void add(String str1,String str2,String str3){
        ArrayList<String> list = new ArrayList<>();
        list.add(str1);
        list.add(str2);
        list.add(str3);
        for (String str :list){
            System.out.println(str);
        }
    }
    public static void main(String[] args) {
    add("111","222","333");
    }
}
