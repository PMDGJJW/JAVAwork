package demo2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class demo {

    public static void main(String[] args) {
//        int a;
//        try {
//            FileInputStream fis = new FileInputStream("D:\\A.txt");
//            a=fis.read();
//            System.out.println((char)a);
//            a=fis.read();
//            System.out.println((char)a);
//            a=fis.read();
//            System.out.println((char)a);
//            fis.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

            int red ;
        try {
            FileInputStream fis = new FileInputStream("D:\\demo\\b1.txt");
            byte [] B= new byte[3];
            while (true){
            red = fis.read(B);
            if (red==-1){
                break;
            }
            else {
                System.out.println(new String(B));
            }
            }
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }



    }

}
