package demo;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Kdemo {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("127.0.0.1",6666);
        Scanner s = new Scanner(System.in);
        String m = s.nextLine();
        OutputStream OS = socket.getOutputStream();
        OS.write(m.getBytes());

        InputStream is = socket.getInputStream();
        int n ;
        byte [] b = new byte[1024];
        n=is.read(b);
        String h = new String(b,0,n);
        System.out.println(h);
        OS.close();
        is.close();

    }
}
