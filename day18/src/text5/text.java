package text5;

import java.io.*;
import java.util.*;

public class text {

    public static void main(String[] args) {
//        Scanner i = new Scanner(System.in);
//        String d = i.nextLine();
        File f = new File("D:\\demojava");
        HashMap<String,String>map = new HashMap<>();
        Set<Map.Entry<String,String>> s = map.entrySet();
        ArrayList<String> list = new ArrayList();
        count(f, map);
        int num = 0;
        for (Map.Entry<String,String> k: s){
           String pname = k.getKey();
           String mname = k.getValue();
           if (mname.endsWith(".java")){
               num++;
           }
           try {
               int n ;
               FileInputStream fis = new FileInputStream(pname);
               File G  = new File("D:\\demo\\"+mname);
               if (G.exists()){
                  Random i = new Random();
                  int newnum = i.nextInt(5000);
                    mname=newnum+mname;
               }
               FileOutputStream fos = new FileOutputStream("D:\\demo\\"+mname);
               while (true){
                   byte [] b = new byte[1024];
                   n=fis.read(b);
                   if (n==-1){
                       break;
                   }
                   fos.write(b,0,n);
               }
               fos.close();
               fis.close();
           }catch (Exception E){

           }
        }
        for (Map.Entry<String,String> ku : s){
            list.add(ku.getValue());
        }
        System.out.println(list);
        System.out.println("java文件有："+num+"个");
    }


    public static void count(File k, HashMap i) {
        File[] arrf = k.listFiles();
        for (File s : arrf) {
            if (s.isDirectory()) {
                count(s,i);
            }
            if (s.isFile()) {
               i.put(s.getAbsolutePath(),s.getName());
            }

        }
    }
}

