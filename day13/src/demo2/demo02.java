package demo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class demo02 {
    public static void main(String[] args) {
        ArrayList<student> list = new ArrayList<>();
        list.add(new student("张三",21,99));
        list.add(new student("李四",23,95));
        list.add(new student("王五",18,92));
        list.add(new student("牛六",21,85));
        list.add(new student("猪三",23,75));
//        Collections.sort(list,(a,b)->{
//            int result = b.getAge()-a.getAge();
//            if (result==0){
//                result=a.getScore()-b.getScore();
//            }
//            return result;
//        });
//        Collections.sort(list, new Comparator<student>() {
//            @Override
//            public int compare(student o1, student o2) {
//                int result = o1.getAge()-o2.getAge();
//                if (result==0){
//                    result=o2.getScore()-o1.getScore();
//                }
//                return result;
//            }
//        });
        Collections.sort(list);
        for (student stu : list){
            System.out.println(stu);
        }

    }

}
