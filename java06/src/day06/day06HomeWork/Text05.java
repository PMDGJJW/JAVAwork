package day06.day06W;

import java.util.ArrayList;

public class Text05 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("姚小明", 23,"打篮球");
        Teacher t2 = new Teacher("景甜", 20, "打羽毛球");
        Teacher t3 = new Teacher("薛之谦",45,"踢足球");
        ArrayList<Teacher>list=new ArrayList<>();
        list.add(t1);
        list.add(t2);
        list.add(t3);
        for ( int x=0;x<list.size();x++){
           list.get(x).show();
        }
        System.out.println("---------------");
        for ( int x=0;x<list.size();x++){
            if(list.get(x).getAge()>40){
                list.get(x).setLike("打高尔夫");
                list.get(x).show();
            }

        }
    }
}
