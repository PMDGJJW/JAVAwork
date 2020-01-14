package Work.text1.text2;

import java.io.File;

public class text {

    public static void main(String[] args) {
        File f = new File("aaa");
        System.out.println(f.exists());
        f.mkdirs();
    }

}
