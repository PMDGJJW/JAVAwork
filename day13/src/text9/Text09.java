package text9;

import java.util.ArrayList;
import java.util.HashSet;

public class Text09 {

    public static void main(String[] args) {

        HashSet<String> list = new HashSet<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("二丫");
        list.add("钱六");
        list.add("孙七");
        list.remove("二丫");
        list.add("王小丫");
        System.out.println(list);
    }
}
