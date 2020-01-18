package demo2;

import java.io.*;

public class demo {
    public static void main(String[] args) throws Exception {
        FileReader fis = new FileReader("D:\\5.txt");
        BufferedReader bw = new BufferedReader(fis);
//        System.out.println( bw.readLine());
//        System.out.println( bw.readLine());
//        System.out.println( bw.readLine());
//        System.out.println( bw.readLine());
        char []c = new char[2];
        int n ;
        while (true){
            n=bw.read(c);
            if (n==-1){
                break;
            }
            System.out.println(new String(c));
        }

    }
}
