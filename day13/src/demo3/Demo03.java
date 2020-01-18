package demo3;

import java.util.ArrayList;

public class Demo03 {
    public static  void add(int...num){
        ArrayList<Integer> list = new ArrayList<>();
        for (int n :num){
            list.add(n);
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        add(11,22,33,44,55,66,77,88);
    }
}
