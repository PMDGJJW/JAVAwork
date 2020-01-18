package text5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("127.0.0.1",8888);
        BufferedInputStream bis  = new BufferedInputStream(new FileInputStream("C:\\Users\\PMDGJJW\\Desktop\\1.png"));
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        int n;
        byte[] b = new byte[1024 * 60];
        while (true) {
            n = bis.read(b);
            if (n==-1){
                break;
            }
            bos.write(b, 0, n);
        }
        bos.close();
        bis.close();
        socket.close();
    }
}
