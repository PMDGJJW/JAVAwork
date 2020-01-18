package day7;

public class Text05 {
    public static void main(String[] args) {
        int a =8;
        int a1= -9;
        double a2= 6.1;
        double a3= 6.8;
        double a4= -6.8;
        double a5 =5.88;
        System.out.println("8的绝对值"+Math.abs(a));
        System.out.println("-9的绝对值"+Math.abs(a1));
        System.out.println("6.1向上取整的值 "+Math.ceil(a2));
        System.out.println("-6.1向上取整的值 "+Math.ceil(-6.1));
        System.out.println("6.8向下取整的值 "+Math.floor(a3));
        System.out.println("-6.8向下取整的值 "+Math.floor(a4));
        System.out.println("5.88四舍五入的值 "+Math.round(a5));
        System.out.println("-5.88四舍五入的值 "+Math.round(-a5));
    }
}
