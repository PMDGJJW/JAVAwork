package day02;

public class text5 {
    public static void main(String[] args) {
        printNum();
    }

    public static void printNum() {
        float f1=(float)12345.01;
        float f2=(float)12345.00;
        float var1=f1>f2? (float)12456:(float)12456.02;
        float var2=(float)(var1+1024);
        System.out.println("var1的值为："+var1);
        System.out.println("var2的值为："+var2);
    }
}
