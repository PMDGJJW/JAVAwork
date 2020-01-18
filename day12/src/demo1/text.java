package demo1;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class text {

    public static void main(String[] args) {
        ArrayList<person> list = new ArrayList<>();
        list.add(new person("马云",50));
        list.add(new person("马飞飞",50));
        list.add(new person("药水哥",25));
        System.out.println("--------------------------------");
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
        System.out.println("--------------------------------");
        list.stream().forEach(System.out::println);
        System.out.println("--------------------------------");
        Iterator <person>it = list.iterator();
        while (it.hasNext()){
            person p1 = it.next();
            System.out.println(p1);
        }
        System.out.println("--------------------------------");
        for (person p2 : list){
            System.out.println(p2);
        }
    }
}
