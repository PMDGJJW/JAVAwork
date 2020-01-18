package day07;

public class Demo3 {
    public static void main(String[] args) {
        String STR = "Hellow World";
        System.out.println(STR.length());
        System.out.println("----------------------------");
        String str2 = STR.concat("_java");
        System.out.println(str2);
        System.out.println("----------------------------");
        char c1 = str2.charAt(0);
        char c2 = str2.charAt(1);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println("‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐");
        //public int indexOf (String str) ：返回指定子字符串第一次出现在该字符串内的索引。// 

        int a = STR.indexOf("o");
        int b = STR.indexOf("l");
        int c = STR.indexOf("ll");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐");
        String sub1 =STR.substring(5);
        System.out.println(sub1);
        System.out.println("‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐");
        String sub2 = STR.substring(2,4);
        System.out.println(sub2);
        System.out.println("‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐");
    }
}
