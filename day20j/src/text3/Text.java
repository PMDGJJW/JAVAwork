package text3;

import java.io.OutputStream;
import java.net.Socket;

public class Text {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("127.0.0.1",8888);
        String M =" hello.服务器,我是客户端。";
        OutputStream os = socket.getOutputStream();
        os.write(M.getBytes());
    }
}
