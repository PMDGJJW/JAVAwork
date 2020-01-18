package text13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Text13 {

    public static void main(String[] args) {
        HashSet<Integer> hset = new HashSet<>();
        while (hset.size()<10){
            Random num = new Random();
            int rnum = num.nextInt(20)+1;
            hset.add(rnum);
        }
        Iterator it = hset.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
