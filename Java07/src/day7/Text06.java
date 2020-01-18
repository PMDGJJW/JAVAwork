package day7;

import java.util.Scanner;

public class Text06 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("请输入一个字符");
        String mgc="奥巴马";
        String str=i.next()  ;
        System.out.println(str.replace(mgc,"*"));
    }
}
