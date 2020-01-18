package day02;

import static javafx.scene.input.KeyCode.J;

public class tetx8 {
    public static void main(String[] args) {
        char ch='J';
        ch=(char)((int)ch+32);
        System.out.println(ch);
        char cha='a';
        cha=(char)((int)cha-32);
        System.out.println(cha);
        double d3=100.5;
        int i3=3;
        double sum3=(d3+i3);
        System.out.println("sum3的值："+sum3);
        System.out.println(sum3);
        System.out.println("sum3的整数部分"+(int)(sum3));
        double d4=120.65;
        int i4=12;
        System.out.println("mul4的整数部分："+(int)(d4*i4));
    }
}
