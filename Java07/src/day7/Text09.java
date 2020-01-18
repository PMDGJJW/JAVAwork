package day7;

import java.util.ArrayList;

public class Text09 {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("cba");
        list.add("daasfas");
        list.add("dddaaa");
        list.add("你好呀");
        list.add("我来了你干嘛");
        list.add("别跑");
        System.out.print("源Arrlist:"+list+" ");
        for (int i =0;i<list.size();i++){
            if (list.get(i).length()>4){
                list.remove(i);
                i--;

            }
        }
            System.out.println("删除后的Arrlist"+list);
    }
}
