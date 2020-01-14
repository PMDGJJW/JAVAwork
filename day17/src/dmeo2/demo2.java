package dmeo2;

import java.io.File;

public class demo2 {

    public static void main(String[] args) {
        File f = new File("D:\\JAVAwork");
        print(f);
    }
    boolean flag= false ;
    public static void print(File k) {
        File[] sk = k.listFiles();
        for (File skt : sk) {
            if (skt.isFile()) {
                System.out.println(skt.getName());
            } else {
                print(skt);
            }
        }
    }
}
