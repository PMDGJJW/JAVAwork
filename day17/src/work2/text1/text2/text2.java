package work2.text1.text2;

import java.io.File;
import java.util.Scanner;

public class text2 {

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("请输入一个文件路径");
        String Str = i.nextLine();
        File f = new File(Str);
        if (f.isFile()){
            System.out.println("文件大小为："+f.length());
        }
        else {
            File [] sk =f.listFiles();
            int sum = 0;
            for (File stk : sk){
                sum +=stk.length();
            }
            System.out.println("文件夹的文件的大小为："+sum);
        }
    }

}
