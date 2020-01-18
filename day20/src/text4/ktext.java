package text4;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ktext {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("127.0.0.1",8555);
        while (true){
            Scanner i = new Scanner(System.in);
            String M = i.nextLine();
            OutputStream os = socket.getOutputStream();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
            bw.write(M);
            if ("exit".equals(M)){
                os.close();
                socket.close();
                return;
            }
            bw.newLine();
            bw.flush();
            InputStream ips = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(ips));
          String msg =  br.readLine();
            if ("exit".equals(br)){
                ips.close();
                os.close();
                socket.close();
                System.out.println("服务器退出了聊天");
                return;
            }
            System.out.println("这是服务端发的消息："+msg);
        }



    }
}
