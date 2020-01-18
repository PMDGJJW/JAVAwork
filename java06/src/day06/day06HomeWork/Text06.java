package day06.day06W;

import java.util.ArrayList;

public class Text06 {
    public static void main(String[] args) {
        Worker W1=new Worker("bz0001","黄渤",45);
        Worker W2=new Worker("bz0002","孙红雷",48);
        Worker W3=new Worker("bz0003","罗志祥",35);
        ArrayList<Worker> list=new ArrayList<>();
        list.add(W1);
        list.add(W2);
        list.add(W3);
        ﬁndMaxAge(list);
    }
    public static void ﬁndMaxAge(ArrayList<Worker>list){
        int maxAgeWorker=list.get(0).getAge();
        for ( int q=1;q<list.size();q++){
            if (maxAgeWorker<list.get(q).getAge()){
                maxAgeWorker=list.get(q).getAge();
                list.get(q).show();
            }
        }
    }

}
