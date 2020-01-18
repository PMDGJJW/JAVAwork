package text9;

import java.io.*;

public class Text {
    public static void main(String[] args) {
    cope();
    show();
    }
    public static void cope(){
        try {
            FileReader fr = new FileReader("b.txt");
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("b1.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            String num ;
            while (true){
                num=br.readLine();
                if (num==null){
                    break;
                }
                bw.write(num);
                bw.newLine();
            }
            bw.close();
            fw.close();
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void show(){
        try {
            FileReader fr = new FileReader("b1.txt");
            BufferedReader br = new BufferedReader(fr);
            String n ;
            while (true){
                n=br.readLine();
                if (n==null){
                    break;
                }
                System.out.println(n);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
