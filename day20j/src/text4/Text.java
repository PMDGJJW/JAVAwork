package text4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Text {
    public static void main(String[] args) throws Exception{
        ServerSocket SERsocket = new ServerSocket(8555);
        Socket socket = SERsocket.accept();
            while (true){
                InputStream IS = socket.getInputStream();
                BufferedReader  br = new BufferedReader(new InputStreamReader(IS));
                String m = br.readLine();
//                String msg = new String(b,0,n);

                if ("exit".equals(m)){
                    IS.close();
                    socket.close();
                    System.out.println("客户端退出了聊天");
                    return;
                }
                System.out.println("这是客户端发送的消息 :"+m);
                Scanner i = new Scanner(System.in);
                String M = i.nextLine();
                OutputStream os = socket.getOutputStream();
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
                if (M.equals("exit")){
                    os.close();
                    IS.close();
                    socket.close();
                    return;
                }

                bw.write(M);
                bw.newLine();
                bw.flush();

            }



    }
}
