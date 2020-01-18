package text15;

import java.util.HashSet;
import java.util.Scanner;

public class Text15 {

    public static void main(String[] args) {
        HashSet<Integer> hset = new HashSet<>();
        while (true){
            Scanner i = new Scanner(System.in);
            Integer str = i.nextInt();
            hset.add(str);
            if (
                    str==-1
            ){
                break;
            }
        }
        int sum=1;
        for (int num : hset){
            sum+=num;
        }
        System.out.println("总和为：" +sum);
        System.out.println("平均值为："+(sum/(hset.size()-1)));
        System.out.println(hset.size());
    }
}
