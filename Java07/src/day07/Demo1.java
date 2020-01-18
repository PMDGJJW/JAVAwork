package day07;

public class Demo1 {
    public static void main(String[] args) {
        String str = new String();
        System.out.println("str:"+str);
        String str2 = new String("ABC");
        System.out.println("stc2:"+str2);
       char [] chs = {'A','B','C','D','E'};
        String str3 = new String(chs);
        System.out.println("Str3"+str3);
        byte [] bty={12,12,23,56,89,8,58,5,};
        String  str4= new String(bty);
        System.out.println("str4:"+str4);
    }
}
