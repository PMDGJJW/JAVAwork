package text5;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class text {
    public static void main(String[] args) throws Exception{
        ArrayList<String> str = new ArrayList<>();
       re(str);
       show(str);
    }
    public static ArrayList<String> re(ArrayList str)throws Exception{
        FileReader fr = new FileReader("text.txt");
        BufferedReader br = new BufferedReader(fr);
        String i;
        while (true){
            i=br.readLine();
            if (i==null){
                break;
            }
            str.add(i);
        }
        Collections.reverse(str);
        br.close();
        fr.close();
        return str;
    }
    public static void show(ArrayList s)throws Exception{
        FileWriter fw = new FileWriter("text1.txt");
        BufferedWriter bw = new BufferedWriter(fw);
       s.stream().forEach(n->{
           try {
               bw.write(String.valueOf(n));
               bw.newLine();
           } catch (IOException e) {
               e.printStackTrace();

           }
       });
       bw.close();
       fw.close();
    }
}
