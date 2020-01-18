package day3;

public class tetx3 {
    public static void main(String[] args) {
        int sum=0;
        for (int x=1;x<=100;x++) {
        if (x%3==0&&x%5==0){
            sum+=x;
        }
        }
        System.out.println("1-100之间既是3的倍数又是5的倍数的数字之和为"+sum);
    }
}
