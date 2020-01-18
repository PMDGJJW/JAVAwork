package day07;

public class Demo2 {
    public static void main(String[] args) {
        String str1 = new String("abcd");
        String str2 = new String("abcd");
        String str3 = new String("ABCD");
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println("----------------------------");
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println("----------------------------");
    }
}
