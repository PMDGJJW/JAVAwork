package work3.text1.text3;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class text {

    public static void main(String[] args) {
        File f = new File("D:\\yys");
        cont c = new cont(0);
        cont2 c1 = new cont2(0);
        cont3 c2 = new cont3(0);
        String num = count(f,c,c1,c2);
        String [] cnum = num.split(",");
        HashMap<String,String> map = new HashMap();
       map.put("CSS文件",cnum[0]);
       map.put("HTML文件",cnum[1]);
       map.put("PNG文件",cnum[2]);
        Set<String> s = map.keySet();
        for (String si : s){
            System.out.println(si+"的类型  ，"+"有"+map.get(si)+" 个");
        }
        Set<Map.Entry<String,String>> se = map.entrySet();
        System.out.println(" ---------------------------         ");
        for (Map.Entry<String,String> keys : se){
            System.out.println(keys.getKey()+"的类型有 ， "+ "有"+keys.getValue()+" 个");
        }
    }
    public static  String count(File k,cont l ,cont2 p,cont3 i){
        File [] s = k.listFiles();
        for (File SKT : s){
            if (SKT.isDirectory()){
                count(SKT,l,p,i);
            }
            if (SKT.getName().endsWith(".css")){
                System.out.println(SKT.getName());
                int num = l.getNum();
                num++;
                l.setNum(num);
            }
            else if (SKT.getName().endsWith(".html")){
                int num = p.getNum();
                num++;
                p.setNum(num);
            }
            else if (SKT.getName().endsWith(".png")){
                int num = i.getAn();
                num++;
                i.setAn(num);
            }
        }

        return l.getNum()+","+p.getNum()+","+i.getAn() ;
    }

}
