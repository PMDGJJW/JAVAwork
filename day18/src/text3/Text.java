package text3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.security.Key;

public class Text {

    public static void main(String[] args) {
        File f= new File("D:\\demo");
        cope(f);
    }
    public  static  void cope(File f1){
        File [] s  = f1.listFiles();
        for ( File key : s){
            int n ;
            byte []byt = new byte[1024];
            try {
                String Dname = "D:\\demo\\";
                FileInputStream fis = new FileInputStream(Dname+key.getName());
                String pasename = "D:\\d2\\";
                FileOutputStream fos = new FileOutputStream(pasename+key.getName());
                while (true){
                    n=fis.read(byt);
                    if (n==-1){
                       break;
                    }
                    fos.write(byt,0,n);
                }
                fos.close();
                fis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
