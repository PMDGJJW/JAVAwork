package work3.text1.text2;

import java.io.File;
import java.util.Scanner;

public class text {

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("请输入要删除的文件夹路径");
        String  s = i.nextLine();
        File f = new File(s);
        del(f);
    }
    public static void del(File sk){
        File [] arrf = sk.listFiles();
        for(File st :arrf){
            st.delete();
            if (st.isDirectory()){
                del(st);
            }
        }
        sk.delete();
    }

}
