package text2;

import java.io.OutputStream;
import java.net.Socket;

public class Ktext {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("127.0.0.1",8888);
        String M ="我爱java";
        OutputStream o = socket.getOutputStream();
        o.write(M.getBytes());
    }
}
