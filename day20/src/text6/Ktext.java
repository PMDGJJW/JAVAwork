package text6;

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
    }
}
