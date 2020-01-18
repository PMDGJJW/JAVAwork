package text2;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;

public class text {
    public static void main(String[] args) throws Exception{

        OutputStreamWriter OSW = new OutputStreamWriter(new FileOutputStream("a.txt"),"gbk");
        OSW.write("我爱java");
        OSW.close();
    }
}
