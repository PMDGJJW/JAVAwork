package day3;

public class text7 {
    public static void main(String[] args) {
        int count=1;
        for (int i=1;i<=60;i++){
           if (i%2==0){
               System.out.print(i+" ");
               count+=1;
           }if (count>5){
                System.out.println();
                count=1;
            }
        }
    }
}
