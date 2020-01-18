package day02;

public class text6 {
    public static void main(String[] args) {
        printstring();
    }
    public static void printstring() {
     int num1=69;
     String str=num1%2==0? "偶数":"奇数";
        System.out.println("num1:"+num1+"是"+str);
    }
}
