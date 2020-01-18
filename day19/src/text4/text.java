package text4;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.Scanner;

public class text {
    public static void main(String[] args) throws Exception{
        Scanner i = new Scanner(System.in);
        String tios = i.nextLine();
        PrintStream ps = new PrintStream("d.txt");
        System.setOut(ps);
        System.out.println(tios);

    }
}
