package day06;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入一个整数");
        int i= in.nextInt();
        System.out.println("请输入二个整数");
        int j= in.nextInt();
        System.out.println("请输入三个整数");
        int q= in.nextInt();
        int max = i;
        if (i<j){
            max=j;
        }
        if (j<q){
            max=q;
        }
        System.out.println("最大值为"+max);
    }
}
