package text3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class text {
    public static void main(String[] args) throws Exception{
        InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt"),"gbk");
        BufferedReader br = new BufferedReader(isr);
        System.out.println(br.readLine());
    }
}
