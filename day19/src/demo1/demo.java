package demo1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class demo {

    public static void main(String[] args) throws Exception {
        fis();
    }

    public static void fis() throws Exception{
        FileInputStream fis = new FileInputStream("D:\\Typora\\Typora.exe");
        FileOutputStream fos = new FileOutputStream("D:\\demo\\Typora.exe");
        int num;
        byte[] b = new byte[1];
        long s = System.currentTimeMillis();
        while (true) {
            num = fis.read(b);
            if (num == -1) {
                break;
            }
            fos.write(b, 0, num);
        }
        fos.close();
        fis.close();
        long d = System.currentTimeMillis();
        System.out.println(d - s);
    }
    public static void bis() throws Exception{
        FileInputStream fis = new FileInputStream("D:\\Typora\\Typora.exe");
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream("D:\\demo\\Typora.exe");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int num;
        byte[] b = new byte[1];
        long s = System.currentTimeMillis();
        while (true) {
            num = bis.read(b);
            if (num == -1) {
                break;
            }
            bos.write(b, 0, num);
        }
        bos.close();
        fos.close();
        bis.close();
        fis.close();
        long d = System.currentTimeMillis();
        System.out.println(d - s);
    }
}
