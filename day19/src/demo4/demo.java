package demo4;

import java.io.*;

public class demo {
    public static void main(String[] args) throws Exception{
        iws();

    }

    public static void irs() throws Exception{
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\5.md"));
        BufferedReader br = new BufferedReader(isr);
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        System.out.println(br.readLine());
    }
    public static void iws()throws Exception{
        OutputStreamWriter ost = new OutputStreamWriter(new FileOutputStream("D:\\5.md"),"UTF-8");
        BufferedWriter bw = new BufferedWriter(ost);
        bw.write("撒附件");
        bw.newLine();
        bw.write("阿萨件");
        ost.write("三个");
        bw.close();
        ost.close();
    }
}
