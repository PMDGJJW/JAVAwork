package text2;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Text {
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();
        InputStream is = socket.getInputStream();
        int m ;
        byte[]b = new byte[1024];
        m=is.read(b);
        String msg = new String(b,0,m);
        System.out.println(msg);
        is.close();
        socket.close();

    }
}
