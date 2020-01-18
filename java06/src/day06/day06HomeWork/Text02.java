package day06.day06W;

import java.util.Random;

public class Text02 {
    public static void main(String[] args) {
        for (int x=1;x<=5;x++){
            Random i=new Random();
            int num=i.nextInt(10)+1;
            System.out.println(num);
        }

    }
}
