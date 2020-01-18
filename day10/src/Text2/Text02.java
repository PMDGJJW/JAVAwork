package Text2;

import java.util.ArrayList;

public class Text02 {
    public static void main(String[] args) {
        student s = new student("小红",0);
        student s1 = new student("小亮",0);
        student s2 = new student("小明",0);
        ArrayList<student> list = new ArrayList<>();
       list.add(s);
       list.add(s1);
       list.add(s2);
       Teacher t= new Teacher("张老师");
      ArrayList <student> clist= t.check(list,"小红");
       t.check(list,"小亮");
       course c = new course("java","张老师");
       c.show(clist);
    }
}
