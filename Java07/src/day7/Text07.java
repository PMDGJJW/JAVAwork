package day7;

import java.util.Scanner;

public class Text07 {
    public static void main(String[] args) {
        Scanner I =new Scanner(System.in);
        System.out.println("请输入一个QQ号码");
        String str = I.next();
        char [] chars = str.toCharArray();
        checkQQ(str,chars);
        boolean ok = checkQQ (str,chars);
        System.out.println("这个QQ号码是否正确:"+ok);
}
    public static boolean checkQQ (String a ,char [] z) {
        for (int i=0;i<a.length();i++){
            if (z[i]<0||z[i]>9){
               return  false;
            }
        }
        if (a.length()<5||a.length()>12){
           return false;
        }
        else if (a.startsWith("0")){
            return  false;
        }
        return true;
    }
    }
