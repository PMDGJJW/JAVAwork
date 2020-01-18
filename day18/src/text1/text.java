package text1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class text {

    public static void main(String[] args) {
        try {
            int a;
            FileInputStream fos = new FileInputStream("D:\\demo\\A.txt");
            HashMap<String,Integer> map = new HashMap<>();
            while (true){
                a=fos.read();
                if (a==-1){
                    break;
                }
                if (!map.containsKey(String.valueOf((char)a))){
                    map.put(String.valueOf((char)a),1);
                }
             else {
                 int num = map.get(String.valueOf((char)a));
                 map.put(String.valueOf((char)a) ,++num);
                }


            }
            fos.close();
            Set <String> sk = map.keySet();
            for (String n : sk){
                System.out.println(n+"出现了 , "+map.get(n)+" 次");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException x){

        }
    }

}
