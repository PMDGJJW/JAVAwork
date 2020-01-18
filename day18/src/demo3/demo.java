package demo3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class demo {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\PMDGJJW\\Desktop\\java笔记.txt");
            FileOutputStream fos = new FileOutputStream("D:\\5.txt");
            int a ;
            byte [] B = new byte[1024*2];
            while (true){
                a = fis.read(B);
                if (a==-1){
                    break;
                }
               fos.write(B,0,a);
            }
            fos.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
