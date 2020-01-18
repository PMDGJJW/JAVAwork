package text4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class text {

    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("D:\\demo\\score.txt");
            Properties p = new Properties();
            p.load(fr);
            Set<String> s = p.stringPropertyNames();
           s.stream().forEach(n->{
               if (n.equals("lisi")){
                   int lscore = Integer.valueOf(p.getProperty(n));
                   lscore=100;
                   p.setProperty(n,String.valueOf(lscore));
               }
           });

            System.out.println(p);
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException C) {

        }

    }

}
