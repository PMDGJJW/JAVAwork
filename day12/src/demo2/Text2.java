package demo2;

import java.util.ArrayList;
import java.util.Collection;

public class Text2 {
    public static void main(String[] args) {
        Collection<person> coll = new ArrayList<>();
        coll.add(new person("马云",50));
        coll.add(new person("马化腾",35));
        coll.add(new person("马飞飞",20));
//        coll.clear();
        for (person p : coll){
            System.out.println(p);
        }
        System.out.println(coll.size());
        System.out.println(coll.isEmpty());
    }


}
