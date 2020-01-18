package text9;

import java.util.ArrayList;
import java.util.Iterator;

public class Text09 {

    public static void main(String[] args) {
        ArrayList<student> list = new ArrayList<>();
        list.add(new student("张三",20,1.80));
        list.add(new student("李氏",21,1.70));
        list.add(new student("王五",22,1.72));
        list.add(new student("李四",20,1.60));
        list.add(new student("张庆",25,1.69));
        list.add(new student("王琦",24,1.79));
        Iterator<student> it = list.iterator();
        while (it.hasNext()){
            student s = it.next();
            int a = s.getAge();
            a+=2;
            s.setAge(a);
        }
        for (student str :list){
            System.out.println(str);
        }
    }
}
