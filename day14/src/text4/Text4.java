package text4;

import java.util.HashMap;
import java.util.Scanner;

public class Text4 {

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
    }

    public static void main(String[] args) {
        Scanner i =new Scanner(System.in);
        String str = i.nextLine();
        findchar(str);
    }
}
