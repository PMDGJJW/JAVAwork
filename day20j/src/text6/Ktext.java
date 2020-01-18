package text6;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Ktext {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("127.0.0.1",8888);
        System.out.println();
        Scanner s = new Scanner(System.in);
        String na = s.nextLine();
        OutputStream os = socket.getOutputStream();
        os.write(na.getBytes());
        InputStream is = socket.getInputStream();
        int n ;
        byte [] b = new byte[1024];
        n=is.read(b);
        String msg = new String(b,0,n);
        System.out.println(msg);
    }
}
