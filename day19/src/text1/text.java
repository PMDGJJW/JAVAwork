package text1;

import java.io.*;
import java.util.Scanner;

public class text {
    public static void main(String[] args) throws Exception{
        Scanner i = new Scanner(System.in);
        System.out.println("请输入一个人验证码");
        String coke = i.nextLine();
        FileWriter fos = new FileWriter("data.txt");
        BufferedWriter bw = new BufferedWriter(fos);
        bw.write(coke);
        bw.close();
        fos.close();
        Scanner U = new Scanner(System.in);
        System.out.println("请输入验证码");
        String PSD = U.nextLine();
        FileReader FR = new FileReader("data.txt");
        BufferedReader BR = new BufferedReader(FR);
        String Check = BR.readLine();
        if (PSD.equals(Check)){
            System.out.println("验证成功");
        }
        else {
            System.out.println("验证失败");
        }
    }
}
