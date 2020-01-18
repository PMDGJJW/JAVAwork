package text7;

import java.io.*;
import java.net.Socket;
import java.util.Random;

public class Ktext07 {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("127.0.0.1",8886);
        while (true){
            Random I = new Random();
            String num = String.valueOf(I.nextInt());
            String Name = num+".png";
            BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(Name));
            int n ;
            byte [] B = new byte[1024];
            while (true){
                n=bis.read(B);
                if (n==-1){
                   break;
                }
                bos.write(B,0,n);
            }
            bos.close();
            bis.close();
            socket.close();
        }

    }
}
