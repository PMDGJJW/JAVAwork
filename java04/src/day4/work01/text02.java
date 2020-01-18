package day4.work01;

public class text02 {
    public static void main(String[] args) {
        int n= getSum(100);
        System.out.println("总和为："+n);
    }

    public static int getSum(int n) {
        int sum=0;
        for (int x=1;x<=n;x++){
            sum +=x;
        }
        return sum;
    }
}
