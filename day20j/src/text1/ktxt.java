package text1;

import java.io.OutputStream;
import java.net.Socket;

public class ktxt  {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1",8888);
        OutputStream os = socket.getOutputStream();
        String m = "我爱java";
        os.write(m.getBytes());
        os.close();
        socket.close();
    }
}
