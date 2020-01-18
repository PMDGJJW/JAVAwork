package day4.work01;

public class text6 {
    public static void main(String[] args) {
        printx(10);
    }
    public static void printx(int a) {
        for (int x=1;x<=a;x++){
            for (int j=1;j<=a;j++){
                if (x==j||x+j==a+1){
                    System.out.print("⭕");
                }
                else {
                    System.out.print("☆");
                }
            }
            System.out.println(" ");
        }
    }
}
