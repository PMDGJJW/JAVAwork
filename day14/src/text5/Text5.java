package text5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class Text5 {

    public  static  void findchar(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            char j = s.charAt(i);
            if (!map.containsKey(j)){
                map.put(j,1);
            }
            else {
                Integer K = map.get(j);
                map.put(j,++K);
            }
        }
        System.out.println(map);
        HashMap<String,Integer> smap = new HashMap<>();
        Set<Map.Entry<Character,Integer>> set = map.entrySet();
        int sum =0;
        int wsum=0;
        int osum=0;
       for (Map.Entry<Character,Integer> key : set){
          int n = key.getKey();
          if (n==32){
              smap.put("空格",key.getValue());
          }
          else if (n>=48&&n<=57){
              int shu=Integer.valueOf (key.getValue())*1;
             sum+=shu;
              smap.put("数字",sum);
          }
          else if (n<=90&&n>=65||n<=122&&n>=97){
              int wshu=Integer.valueOf (key.getValue())*1;
              wsum+=wshu;
              smap.put("字母",wsum);
          }
          else {
              int oshu=Integer.valueOf (key.getValue())*1;
              osum+=oshu;
              smap.put("其他字符",osum);
          }
       }
        System.out.println(smap);
    }
    public static void main(String[] args) {
        Scanner i =new Scanner(System.in);
        String str = i.nextLine();
        findchar(str);
    }

}
