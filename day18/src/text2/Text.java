package text2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Text {

    public static void main(String[] args) throws Exception {

       FileOutputStream fos = new FileOutputStream("D:\\demo\\student.txt");
        while (true){
            Scanner  i = new Scanner(System.in);
            String  p = i.nextLine();
            if (p.equals("end")){
                break;
            }
            byte[]b = p.getBytes();
            fos.write(b);
            fos.write("\r\n".getBytes());
        }
        fos.close();
    }

}
