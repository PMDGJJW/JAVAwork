package work3.text1;

import java.io.File;

public class text {

    public static void main(String[] args) {
        File f =new File("D:\\yys");
        sel(f);
    }
    public static  void  sel(File k ){
        File [] str = k.listFiles();
        for (File skt : str){
            long n =skt.length();
           if (skt.isFile()){
               if (n<204800) {
                   System.out.println("文件夹内小于200k的文件是"+skt.getName());
               }
           }
           else {
               sel(skt);
           }

        }

    }
}
