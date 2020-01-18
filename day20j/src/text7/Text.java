package text7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Text {
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket(8886);
        while (true){
            Socket socket = serverSocket.accept();
            BufferedInputStream BIS = new BufferedInputStream(new FileInputStream("2434.png"));
            BufferedOutputStream BOS = new BufferedOutputStream(socket.getOutputStream());
            int nm;
            byte [] by = new byte[1024];
            while (true){
                nm=BIS.read(by);
                if (nm==-1){
                    break;
                }
                BOS.write(by,0,nm);
            }
            BOS.close();
            BIS.close();
            socket.close();
        }

    }
}
