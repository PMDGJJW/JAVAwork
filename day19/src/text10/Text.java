package text10;

import java.io.*;

public class Text {
    public static void main(String[] args) {
        cope();
    }
    public static void cope(){
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\PMDGJJW\\Desktop\\1.png");
            BufferedInputStream bis = new BufferedInputStream(fis);
            FileOutputStream fos = new FileOutputStream("2.png");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            int  n;
            byte [] b = new byte[1024];
            while (true){
                n=bis.read(b);
                if (n==-1){
                    break;
                }
                bos.write(b,0,n);
            }
            bos.close();
            fos.close();
            bis.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
