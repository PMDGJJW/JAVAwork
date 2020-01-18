package day4.work01;

public class text03 {
    public static void main(String[] args) {
       int sum= getPerimeter(20 ,8);
       int area= getArea(20,8);
        System.out.println("长方形的周长为："+sum);
        System.out.println("长方形的面积为："+area);

    }

    public static int getPerimeter(int wihth,int heigth) {
       int zc=(wihth+heigth)*2;
       return  zc;
    }
    public static int getArea(int wihth,int lengh) {
        int mz=(wihth*lengh);
        return  mz;
    }
}
