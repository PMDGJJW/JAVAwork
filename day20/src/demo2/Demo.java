package demo2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo {
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("J.png"));
        int n ;
        byte [] b = new byte[1024*8];
        n=bis.read(b);
        bos.write(b,0,n);
        bos.close();
        bis.close();
    }
}
