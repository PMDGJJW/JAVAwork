package text6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;
import java.util.Set;

public class text {
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket(8888);
        while (true){
            Socket socket = serverSocket.accept();
            OutputStream os = socket.getOutputStream();
            FileReader fis = new FileReader("user.txt");
            FileWriter fw = new FileWriter("user.txt" ,true);
            Properties p = new Properties();
        p.load(fis);
        Set<String> s = p.stringPropertyNames();
            InputStream is = socket.getInputStream();
            int n;
            byte [] b= new byte[1024];
            n=is.read(b);
            String check = new String(b,0,n);
            String [] keys = check.split("=");
            for (String va : s) {
                if (keys[0].equals(va) && keys[1].equals(p.getProperty(va))) {
                    String msg = "登陆成功";
                    os.write(msg.getBytes());
                }
            }
            if (p.isEmpty()){
                fw.write(check);
                fw.write("\r\n");
                fw.close();
            }else {
                for (String key : s) {
                    System.out.println(key);
                    if (keys[0].equals(key)) {
                        String msg = "对不起，用户名存在";
                        os.write(msg.getBytes());
                    } else {
                        fw.write(check);
                        fw.write("\r\n");
                        fw.close();
                        String msg = "注册成功";
                        os.write(msg.getBytes());
                    }
                }
            }
        }

    }
}
