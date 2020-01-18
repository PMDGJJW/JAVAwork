package text16;

import java.util.HashSet;
import java.util.Scanner;

public class Text16 {
    public static void main(String[] args) {
        HashSet hst = new HashSet<>();
        Scanner i = new Scanner(System.in);
        String str = i.next();

        for (int j = 0; j <str.length() ; j++) {
            hst.add(str.charAt(j));
        }
       for (Object str2 :hst){
           System.out.println(str2);
       }
    }

}
