package Work.text1.text6;

import java.io.File;

public class text {
    public static void main(String[] args) {
        File f = new File("D:\\JAVAwork\\day17\\src");
        String[] arrstr = f.list();

        for (String str : arrstr) {
            System.out.println(str);
        }
    }
}
