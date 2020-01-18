package text11;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Text {
    public static void main(String[] args) {
       move();
    }
    public static void move(){
        try {
            FileOutputStream fos = new FileOutputStream("a.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            String nu = "i love java";
            bos.write(nu.getBytes());
            bos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
