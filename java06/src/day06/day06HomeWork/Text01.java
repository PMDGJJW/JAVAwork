package day06.day06W;

import java.util.Scanner;

public class Text01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("请输入第一个数据");
        int num=in.nextInt();
        System.out.println("请输入第二个数据");
        int num1=in.nextInt();
        System.out.println("请输入第三个数据");
        int num2=in.nextInt();
       int max=num;
       if (num<num1){
           max=num1;
       }
       if (num1<num2){
           max=num2;
       }
        System.out.println("三个数最大值为"+max);
    }
}
