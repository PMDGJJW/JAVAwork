package text5;

import java.util.ArrayList;
import java.util.Iterator;

public class Text05 {

    public static void main(String[] args) {
        ArrayList<student> list = new ArrayList<>();
        list.add(new student("小明",20,85));
        list.add(new student("小花",18,95));
        list.add(new student("小黄",25,75));
        list.add(new student("小红",21,65));
        list.add(new student("小绿",23,91));
        Iterator<student> it = list.iterator();
        int max = list.get(0).getScore();
        int min =list.get(0).getScore();
        int zhong = 0;
        while (it.hasNext()){
            int score = it.next().getScore();
            if (max<score){
                max=score;
            }
            if (min>score){
                min=score;
            }
           zhong+=score;
        }
        System.out.println("max:"+max);
        System.out.println("min:"+min);
        System.out.println("总"+zhong);
    }
}
