package work3.text1.text4;

import java.io.File;
import java.security.Key;
import java.util.*;

public class text {

    public static void main(String[] args) {
        File f = new File("D:\\JAVAwork\\day15");
        ArrayList<String> s = new ArrayList<>();
        col(f,s);
        Collections.sort(s);
        for ( String K: s){
            System.out.println(K);
        }
    }

    public static ArrayList  col(File k ,ArrayList x) {
        File[] farr = k.listFiles();
        for (File key : farr){
            if (key.isDirectory()){
              File [] ha = key.listFiles();
              for (File JK : ha){
                  x.add(JK.getName());
              }
            }

        }
        return x;
    }
}
