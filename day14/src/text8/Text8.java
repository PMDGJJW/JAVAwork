package text8;


import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Text8 {

    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        while (map.size()<5){
            Scanner i = new Scanner(System.in);
            String name = i.nextLine();
            Random r = new Random();
            int score = r.nextInt(100);
            map.put(name,score);
        }
        int max = 0;
        int min = 50;
        int sum = 0;
        Set<String> set = map.keySet();
        for ( String key : set){
            sum+=map.get(key);
            if (map.get(key)>=max){
                max=map.get(key);
            }
            if ( map.get(key)<=min&&map.get(key)<max){
                min=map.get(key);
            }
        }
        System.out.println(map);
        System.out.println("最高分："+ max);
        System.out.println("最低分："+ min);
        System.out.println("总分："+ sum);
        System.out.println("平均分："+(sum/map.size()));

    }
}
