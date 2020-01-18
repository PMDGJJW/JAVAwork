package demo6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader(new File("D:\\demo\\b1.txt"));
            char [] c = new char[3];
            int n ;
            while (true){
               n= fr.read(c);
               if (n==-1){
                   break;
               }
                System.out.println(c);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
