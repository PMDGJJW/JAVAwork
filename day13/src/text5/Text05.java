package text5;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Text05 {

    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("王昭君");
        linkedHashSet.add("王昭君");
        linkedHashSet.add("西施");
        linkedHashSet.add("杨玉环");
        linkedHashSet.add("貂蝉");
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("--------------");
        for (Object STR :linkedHashSet){
            System.out.println(STR);
        }
    }
}
