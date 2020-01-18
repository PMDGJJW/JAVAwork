package text6;

import java.util.ArrayList;
import java.util.Iterator;

public class text06 {

    public static void main(String[] args) {
        ArrayList<student> list = new ArrayList<>();
        list.add(new student("张三",20,1.80));
        list.add(new student("李氏",21,1.70));
        list.add(new student("王五",22,1.72));
        list.add(new student("李四",20,1.60));
        list.add(new student("张庆",25,1.69));
        list.add(new student("王琦",24,1.79));
        Iterator<student> it = list.iterator();
        double max = list.get(0).getHeight();
        double min = list.get(0).getHeight();
        while (it.hasNext()){
            double person_hight = it.next().getHeight();
            if (person_hight>it.next().getHeight()){
                max=person_hight;
            }
            if (person_hight<it.next().getHeight()){
                min=person_hight;
            }

        }
        System.out.println(max);
        System.out.println(min);
        Iterator<student> nit = list.iterator();
        for (int i = 0; i <list.size() ; i++) {
            if (max==list.get(i).getHeight()){
                System.out.println("最高的人"+list.get(i).getName()+list.get(i).getHeight());
            }
            if (min==list.get(i).getHeight()){
                System.out.println("最矮的人"+list.get(i).getName()+list.get(i).getHeight());
            }
        }
    }
}
