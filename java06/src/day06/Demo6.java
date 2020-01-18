package day06;

import java.util.Random;
import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        Random i=new Random();
        int num = i.nextInt(100)+1;
        Scanner in= new Scanner(System.in);
        while (true){
            System.out.println("请输入第一一个整数");
            int u = in.nextInt();
            if (u<num){
                System.out.println("猜小了哦");
            }
            else if (u>num){
                System.out.println("猜大了哦");
            }
            else if (u==num){
                System.out.println("对了");
                break;
            }
        }

    }
}
