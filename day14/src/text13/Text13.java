package text13;

import java.util.*;

public class Text13 {

    public static void main(String[] args) {
        String ID = "";
        Set<String> set = new HashSet<>();
        while (set.size()<4){
            for (int i = 0; i <8 ; i++) {
                Random ni = new Random();
                String in =String.valueOf(ni.nextInt(9)) ;
                ID+=in;
            }
            set.add(ID);
            ID ="";
        }
        ArrayList<String>list = new ArrayList<>();
        for (String str :set){
            list.add(str);
        }
        HashMap<String,String> map = new HashMap<>();
        map.put(list.get(0),"苹果");
        map.put(list.get(1),"香蕉");
        map.put(list.get(2),"西瓜");
        map.put(list.get(3),"橙子");
        boolean flag = true;
        System.out.println(list);
        while (flag){
        Scanner NUM  = new Scanner(System.in);
        String Select = NUM.nextLine();
            if (!map.containsKey(Select)){
                System.out.println("查无此商品");
            }
            else {
                System.out.println("查询的结果是:   "+map.get(Select));
                flag=false;
            }

        }
    }
}
