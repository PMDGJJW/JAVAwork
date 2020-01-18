package text2;

import java.util.*;

public class Text2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张飞");
        list.add("赵云");
        list.add("关羽");
        list.add("刘备");
        list.add("曹操");
        list.add("孙权");
        list.add("刘禅");
        list.add("周瑜");
        list.add("大桥");
        list.add("小乔");
        Collections.shuffle(list);
        Runnable T = new Runnable() {
            @Override
            public void run() {
                for (String N : list){
                    try {
                        Thread.sleep(5000);
                    }catch (Exception e){

                    }

                    System.out.println(N+"正在走进山洞");
                }
            }
        };
        Thread X = new Thread(T);
        X.start();
    }


}
