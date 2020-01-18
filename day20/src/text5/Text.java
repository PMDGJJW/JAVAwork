package text5;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Text {
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket(8888);
        byte []b = new byte[1024];
        int n ;
        while (true) {
            Socket socket = serverSocket.accept();
            BufferedInputStream br = new BufferedInputStream(socket.getInputStream());
            Random i = new Random();
            int name = i.nextInt(5000);
            String h = String.valueOf(name)+".png";
            BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream(String.valueOf(h)));
            while (true){
                n=br.read(b);
            if (n==-1){
                break;
            }
                bw.write(b,0,n);
            }
            bw.close();
            br.close();

        }

    }
}
