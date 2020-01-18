package text3;

import java.util.HashSet;
import java.util.Iterator;

public class Text03 {

    public static void main(String[] args) {
        HashSet SET = new HashSet();
        SET.add("ZHANGSAN");
        SET.add("LISI");
        SET.add("WANGWU");
        SET.add("ZHANGSAN");
        Iterator  it =SET.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
