package text2;

import java.io.File;

public class Text2 {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\PMDGJJW\\Desktop\\java");
//        String [] arrstr  = file.list();
//        for (String str : arrstr){
//            System.out.println(str);
//        }
        File [] fo = file.listFiles();
        for (File s : fo){
            System.out.println(
                    s.getAbsolutePath()
            );
        }
    }

}
