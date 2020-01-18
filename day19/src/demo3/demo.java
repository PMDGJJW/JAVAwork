package demo3;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class demo {
    public static void main(String[] args) throws Exception{
        FileWriter fw = new FileWriter("D:\\5.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("hellow,pmndg");
        bw.write("\r\n");
        bw.write("pmdg737");
        bw.close();
        fw.close();
    }
}
