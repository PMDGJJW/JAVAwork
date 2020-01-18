package text7;

import java.util.ArrayList;

public class Text07 {
    public static void frequency(ArrayList<String> arr,String Key){
        int a =0;
        for (String num : arr){
            if (Key==num){
                a++;
            }
        }
        System.out.println(Key+"出现了"+a+"次");
    }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("b");
        list.add("a");
        frequency(list,"a");
    }
}
