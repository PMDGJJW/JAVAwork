package demo6;

import java.io.PrintStream;

public class demo {
    public static void main(String[] args) throws Exception{
        System.out.println("hellow");
        PrintStream ps = new PrintStream("D:\\demo\\p.txt");
        System.setOut(ps);
        System.out.println("aaa");
        System.out.println("bbb");
    }
}
