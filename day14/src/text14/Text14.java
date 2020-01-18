package text14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Text14 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("♣");
        list.add("♥");
        list.add("♠");
        list.add("♦");
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("2");
        list1.add("A");
        list1.add("K");
        list1.add("Q");
        list1.add("J");
        HashMap<Integer,String> DK = new HashMap<>();
        int num = 0;
        DK.put(num,"大王");
        DK.put(++num,"小王");
        for (int i = 10; i>=3 ; i--) {
            list1.add(i+"");
        }
        for (int i = 0; i <list1.size() ; i++) {
            for (int j = 0; j <list.size() ; j++) {
                String Card = list.get(j)+list1.get(i);
                DK.put(++num,Card);
            }
        }
        Set<Integer> set = DK.keySet();
        ArrayList <Integer> cnum = new ArrayList<>();
        for (Integer key : set){
            cnum.add(key);
        }
        Collections.shuffle(cnum);
       ArrayList<Integer> p1num = new ArrayList<>();
       ArrayList<Integer> p2num = new ArrayList<>();
       ArrayList<Integer> p3num = new ArrayList<>();
       ArrayList<Integer> dpnum = new ArrayList<>();
        for (int i = 0; i <cnum.size() ; i++) {
            if (i>50){
                dpnum.add(cnum.get(i));
            }
            else if (i%3==0){
                p1num.add(cnum.get(i));
            }
            else if (i%3==1){
                p2num.add(cnum.get(i));
            }
            else if (i%3==2){
                p3num.add(cnum.get(i));
            }
        }
       Collections.sort(p1num);
       Collections.sort(p2num);
       Collections.sort(p3num);
       Collections.sort(dpnum);
        HashMap<Integer,String> p1map = new HashMap<>();
        HashMap<Integer,String> p2map = new HashMap<>();
        HashMap<Integer,String> p3map = new HashMap<>();
        HashMap<Integer,String> dpmap = new HashMap<>();
        for (int i = 0; i <p1num.size() ; i++) {
            p1map.put(i,DK.get(p1num.get(i)));
        }
        for (int i = 0; i <p2num.size() ; i++) {
            p2map.put(i,DK.get(p2num.get(i)));
        }
        for (int i = 0; i <p3num.size() ; i++) {
            p3map.put(i,DK.get(p3num.get(i)));
        }
        for (int i = 0; i <dpnum.size() ; i++) {
            dpmap.put(i,DK.get(dpnum.get(i)));
        }
        System.out.println(p1map);
        System.out.println(p2map);
        System.out.println(p3map);
        System.out.println(dpmap);

    }

}
