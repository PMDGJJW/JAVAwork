package text4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Text04 {

    public static void main(String[] args) {
        HashSet<person>SET = new HashSet();
        SET.add(new person("张三",30));
        SET.add(new person("李四",25));
        SET.add(new person("王五",25));
        SET.add(new person("张三",30));
        Iterator it = SET.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
