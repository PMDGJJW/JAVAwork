package Work.text1;

import java.io.File;
import java.io.IOException;

public class text1 {

    public static void main(String[] args) {
        File f =new File("a.txt");
        System.out.println(f.exists());
        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
