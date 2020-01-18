package day4.work01;

public class tetx07 {
    public static void main(String[] args) {
        System.out.println(2.1+"->"+ round(2.1));
        System.out.println(2.4+"->"+ round(2.4));
        System.out.println(2.5+"->"+ round(2.5));
        System.out.println(2.9+"->"+ round(2.9));
    }
    public static int round(double a) {
        int n=(int)(a+=0.5);
        return n;
    }
}
