package day06;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int i = in.nextInt();
        System.out.println("请输入第二个整数");
        int q = in.nextInt();
        int sum=i+q;
        System.out.println(sum);
    }
}
