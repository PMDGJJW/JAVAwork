package Work.text1.text5;

import java.io.File;

public class text {

    public static void main(String[] args) {
        File f =new File("a.txt");
        if (f.isFile()==true){
            System.out.println(f.getName()+"是一个文件");
        }
        else {
            System.out.println(f.getName()+"不是一个文件");
        }
        File f1 =new File("ccc");
        if (f1.isDirectory()==true){
            System.out.println(f1.getName()+"是一个文件夹");
        }
        else {
            System.out.println(f1.getName()+"不是一个文件夹");
        }
    }

}
