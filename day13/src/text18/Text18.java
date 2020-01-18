package text18;

import java.util.HashSet;
import java.util.Iterator;

public class Text18 {
    public static void main(String[] args) {
        HashSet<student> hst = new HashSet<>();
        hst.add(new student("王五",23,95));
        hst.add(new student("李四",21,85));
        hst.add(new student("张强",19,65));
        hst.add(new student("张三",26,88));
        hst.add(new student("张三",26,88));
        Iterator<student> it = hst.iterator();
        int max = 0;
        int min = 0;
        int sum = 0;
        while (it.hasNext()){
            student stu =  it.next();
            sum +=stu.getScore();
            if (stu.getScore()>max){
                max=stu.getScore();
            }
            if (stu.getScore()<max){
                min=stu.getScore();
            }
        }
        System.out.println("最高分为:"+max);
        System.out.println("最低分为:"+min);
        System.out.println("总分为:"+sum);
        System.out.println("平均分为:"+(sum/hst.size()));
    }
}
