package day4.work01.work2;

public class Text09 {
    public static void main(String[] args) {
        String [] huase={"黑桃","红桃","梅花","方片"};
        String [] paiku={"A","2","3","4","5","6","7","8","9","10","J","K","Q"};
        for (int i = 0; i <13 ; i++) {
            System.out.print(huase[0]+paiku[i]+" ");
        }
        System.out.println(" ");
        for (int i = 0; i <13 ; i++) {
            System.out.print(huase[1]+paiku[i]+" ");
        }
        System.out.println(" ");
        for (int i = 0; i <13 ; i++) {
            System.out.print(huase[2]+paiku[i]+" ");
        }
        System.out.println(" ");
        for (int i = 0; i <13 ; i++) {
            System.out.print(huase[3]+paiku[i]+" ");
        }
    }
}
