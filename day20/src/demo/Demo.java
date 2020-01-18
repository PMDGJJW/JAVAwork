package demo;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws Exception{
        System.out.println("服务器连接ing");
        ServerSocket serverSocket = new ServerSocket(6666);
        Socket socket = serverSocket.accept();
        System.out.println("连接成功");
        InputStream is = socket.getInputStream();
        int n ;
        byte [] b = new byte[1024];
           n=is.read(b);
           String m = new String(b,0,n);
           System.out.println(m);

        OutputStream os = socket.getOutputStream();
        Scanner sk = new Scanner(System.in);
        String hj = sk.nextLine();
        os.write(hj.getBytes());
        os.close();
        is.close();
    }
}
