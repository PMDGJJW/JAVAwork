package text10;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Text10 {

    public static void main(String[] args) {
        String[] strs = {"12345","67891","2347809933","98765432102","67891","12347809933"};
        LinkedList list = new LinkedList();

        for (int i = 0; i <strs.length ; i++) {
            Boolean flag= true;
            for (int j = 1; j <list.size();j++) {
                if (list.get(j)==strs[i]){
                   flag=false;
                }
            }
            if (flag){
                list.addLast(strs[i]);
            }

        }
        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("-----------");
        for (Object STR :list){
            System.out.println(STR);
        }
    }
}
