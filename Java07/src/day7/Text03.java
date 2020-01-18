package day7;

public class Text03 {
    public static void main(String[] args) {
        String str = "HelloWorld广州";
        int a = str.length();
        System.out.println("str字符串的长度 :"+a);
        char  a1 = str.charAt(2);
        System.out.println("取str字符串索引为2的char值 "+a1);
        int a2=str.indexOf("o");
        System.out.println("取字符串o第一次出现在该字符串内的索引 "+a2);
        String a3 = str.substring(6);
        System.out.println("截取字符串str,从索引6开始到结束"+a3);
        String a4 = str.substring(2,7);
        System.out.println("截取字符串str,从索引2开始到7结束"+a4);
    }
}
