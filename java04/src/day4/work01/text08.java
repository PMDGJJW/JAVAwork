package day4.work01;

public class text08 {
    public static void main(String[] args) {

        System.out.println("摄氏度为"+"37.9"+"--"+"华氏度为："+temp(37.9));
        System.out.println("摄氏度为"+"57.9"+"--"+"华氏度为："+temp(47.9));
    }

    public static double temp(double a) {
        double f=(9.0/5)*a+32;
        return f;
    }
}
