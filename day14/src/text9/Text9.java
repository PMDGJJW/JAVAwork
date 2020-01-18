package text9;

import java.util.*;

public class Text9 {

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        int nn = map.size();
        while (nn<5){
        Scanner i = new Scanner(System.in);
        String Book = i.nextLine();
        if (Book.indexOf(",")==-1){
            System.out.println("您输入的格式有误，请重新输入！！");
        }
        else {
            nn++;
            String [] booklist = Book.split(",");
            map.put(String.valueOf(booklist[0]),String.valueOf(booklist[1]));
        }
        }
        Set <String> set = map.keySet();
        for (String key : set){
            System.out.println("书名："+key+"价格："+map.get(key));
        }
        Iterator <String> it = set.iterator();
//        while (it.hasNext()){
//            String sit = it.next();
//            System.out.println("书名："+sit+"价格："+ map.get(sit));
//        }
        String bookPrice = map.get("java");
        double i = Double.valueOf( bookPrice);
        double newPrice = i+=38.5;
        map.put("java",String.valueOf(newPrice));
        map.remove("c++");
        System.out.println("--------keyset----------------");
        for (String key : set){
            System.out.println("书名："+key+"价格："+map.get(key));
        }
        Set<Map.Entry<String,String>> nset = map.entrySet();
        System.out.println("-------entryset-----------------");
        for (Map.Entry<String,String> keys : nset ){
            System.out.println("书名："+keys.getKey()+"价格："+ keys.getValue());
        }
    }

}
