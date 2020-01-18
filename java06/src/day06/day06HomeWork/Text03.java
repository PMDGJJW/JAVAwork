package day06.day06W;

import java.util.ArrayList;

public class Text03 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
            String S0="孙悟空";
            String S1="猪八戒";
            String S2="沙和尚";
            String S3="铁扇公主";
            list.add(S0);
            list.add(S1);
            list.add(S2);
            list.add(S3);
        System.out.println("获取索引为3的元素"+list.get(3));
            list.set(3,"唐僧");
            list.remove(1);
            for ( int u=0;u<list.size();u++  ){
                System.out.println(list.get(u));
            }
    }
}
