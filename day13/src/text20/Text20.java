package text20;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Text20 {
    public static void main(String[] args) {
        HashSet<student> class1 = new HashSet<>();
        HashSet<student> class2 = new HashSet<>();
        class1.add(new student("张三",24));
        class1.add(new student("李四",22));
        class1.add(new student("王五",21));
        class2.add(new student("小明",18));
        class2.add(new student("小花",20));
        class2.add(new student("小强",19));
        HashSet <HashSet<student>>temp = new HashSet();
        Collections.addAll(temp,class1,class2);
        for (HashSet<student> p1 :temp){
            System.out.println(p1);
        }
        System.out.println("-----------迭代循环----------------");
        Iterator <HashSet<student>>it = temp.iterator();
        while (it.hasNext()){
           HashSet<student> stu =it.next();
            System.out.println(stu);
        }
    }

}
