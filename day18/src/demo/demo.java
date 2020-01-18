package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class demo {

    public static void main(String[] args) {
        File f =new File("D:\\A.txt");
        try {
            FileOutputStream fos = new FileOutputStream(f);
            fos.write(97);
            fos.write(98);
            fos.write(99);
            fos.write(100);
            fos.write(101);
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            FileOutputStream fos = new FileOutputStream("D:\\A.txt");
            String Str = "hellow - pmdgjjw";
            byte [] S= Str.getBytes();
            fos.write(S);
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            FileOutputStream fos = new FileOutputStream(f);
            String Str = "你pmdgjjw好";
            byte [] S= Str.getBytes();
            fos.write(S,2,S.length);
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
