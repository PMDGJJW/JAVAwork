package text3;

import java.io.File;
import java.io.IOException;

public class Text33 {

    public static void main(String[] args) {
        File file  =  new File("PMDGJJW\\FSX\\JJW");
        try {
//            file.createNewFile();
//            file.mkdirs();
            file.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
