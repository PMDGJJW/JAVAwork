package day4.work01;

public class text09 {
    public static void main(String[] args) {
        cheng(9);
    }

    public static void cheng(int a) {
        for (int i=1;i<=a;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+"×"+i+"="+(i*j)+" ");
            }
            System.out.println(" ");
        }
    }
}
