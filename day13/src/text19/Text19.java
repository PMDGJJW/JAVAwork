package text19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Text19 {

    public static void main(String[] args) {
        HashSet <String> red = new HashSet<>();
        HashSet<String> bule = new HashSet<>();
        ArrayList<String> qiu = new ArrayList<>();
        while (red.size()<6){
            Random i = new Random();
            int rnum = i.nextInt(33)+1;
            red.add("红球"+rnum);
        }
        qiu.addAll(0,red);
        while (bule.size()<1){
            Random j = new Random();
            int bnum = j.nextInt(16)+1;
            bule.add("蓝球"+bnum);
        }
        qiu.addAll(red.size(),bule);
       for (String str :qiu){
           System.out.print(str+"  ");
       }
        System.out.println(" ");
    }
}
