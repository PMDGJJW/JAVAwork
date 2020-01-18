package day4.work01;

public class text01 {
    public static void main(String[] args) {
        printEven(20);
    }

    public static void printEven(int n) {
        for (int x = 1; x <= n; x++) {
            if (x % 2 == 0) {
                System.out.println(x);
            }
        }
    }
}
