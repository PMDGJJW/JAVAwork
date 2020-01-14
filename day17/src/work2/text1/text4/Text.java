package work2.text1.text4;

import java.io.File;

public class Text {

    public static void main(String[] args) {
        File F  = new File("D:\\JAVAwork\\day15");
        print(F);
    }
    public  static  void print(File k){
        File [] sk = k.listFiles();
        for (File stk : sk){
            if (stk.isFile()){

                if (stk.getName().endsWith(".java")){
                    System.out.println(stk.getName());
                }

            }
            else {
                print(stk);
            }
        }
    }

}
