package day06.day06W;

import java.util.ArrayList;

public class Text04 {
    public static void main(String[] args) {
        Student S1=new Student("it001","黄渤",1.72);
        Student S2=new Student("it002","孙红雷",1.78);
        Student S3=new Student("it003","章子怡",1.64);
        Student S4=new Student("it004","杨颖",1.68);
        ArrayList<Student>list=new ArrayList<>();
        list.add(S1);
        list.add(S2);
        list.add(S3);
        list.add(S4);
        System.out.println("集合大小"+list.size());
        for (int q=0;q<list.size();q++){
            System.out.println(list.get(q).getNum()+","+list.get(q).getName()+","+list.get(q).getHeight());
            if (list.get(q).getHeight()>1.7){
                System.out.println(list.get(q).getNum()+","+list.get(q).getName()+","+list.get(q).getHeight());
            }
        }
        System.out.println("-----------------");
        System.out.println("身高1.70以上的学员");
        for (int b=0;b<list.size();b++){
            if (list.get(b).getHeight()>1.7){
                System.out.println(list.get(b).getNum()+","+list.get(b).getName()+","+list.get(b).getHeight());
            }
        }
    }
}
