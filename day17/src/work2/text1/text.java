package work2.text1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class text {

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("请输入一个文件路径");
        String Str = i.nextLine();
        File f = new File(Str);
        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (f.exists()){
            System.out.println(f.length());
        }
    }

}
