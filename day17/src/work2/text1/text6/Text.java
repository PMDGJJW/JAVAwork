package work2.text1.text6;

import java.io.File;
import java.util.Scanner;

public class Text {

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("请输入要统计的文件夹大小的路径");
        String  s = i.nextLine();
        File f = new File(s);
        System.out.println("文件夹的大小为："+sum(f)) ;
    }
    public static int sum(File f){
        int sumc = 0;
        File [] sk = f.listFiles();
        for (File skt : sk){
            if (skt.isDirectory()){
                sum(skt);
            }
            else {

                sumc+=skt.length();
            }


        }
       return sumc;
    }
}
