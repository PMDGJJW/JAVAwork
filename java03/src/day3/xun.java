package day3;

public class xun {
    public static void main(String[] args) {
        int i= 1;
        int sum=0;
//        while (i<=100){
//            sum+=i;
//            i++;
//        }
//        System.out.println(sum);
        do { sum+=i;
            i++;
        }while (i<=100);
        System.out.println(sum);
    }
}
