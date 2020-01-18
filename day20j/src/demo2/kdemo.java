package demo2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.net.Socket;

public class kdemo {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("127.0.0.1",8888);
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\PMDGJJW\\Desktop\\1.png"));
        BufferedOutputStream BOS = new BufferedOutputStream(socket.getOutputStream());
        int n ;
        byte [] b = new byte[1024*9];
        n = bis.read(b);
        BOS.write(b,0,n);
        BOS.close();
        bis.close();
    }
}
