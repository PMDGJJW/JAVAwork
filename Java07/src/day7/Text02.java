package day7;

public class Text02 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        String str3 = "Hello";
        System.out.println("str1和str2内容是否相等:"+str1.equals(str2));
        System.out.println("str1和str3内容是否相等:"+str1.equals(str3));
        System.out.println("忽略大小写比较str1和str3内容是否相等:"+str1.equalsIgnoreCase(str3));
       boolean a1 = str1.startsWith("He");
        boolean b1 = str1.startsWith("abc");
        System.out.println("str1字符串是否以He前缀开头"+a1);
        System.out.println("str1字符串是否以abc前缀开头"+b1);
        boolean a2 = str1.endsWith("o");
        boolean b2 = str1.endsWith("l");
        System.out.println("str1字符串是否以o后缀结尾"+a2);
        System.out.println("str1字符串是否以l后缀结尾"+b2);
    }
}
