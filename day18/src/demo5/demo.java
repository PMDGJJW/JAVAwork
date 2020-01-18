package demo5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;
import java.util.Set;

public class demo {

    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("D:\\demo\\student.txt");
            Properties p = new Properties();
            p.load(fr);
            Set<String> s = p.stringPropertyNames();

            for (String n :s){
                System.out.println("key: "+ n+" value ： "+p.getProperty(n));
            }
            System.out.println("--------------------------------");
            Use U = new Use();
            s.stream().forEach(y->{
                System.out.println(y+p.getProperty(y));
                if ("name".equals(y)){
                    U.setName(p.getProperty(y));
                }
                if ("age".equals(y)){
                    U.setAge(p.getProperty(y));
                }
                if ("ms".equals(y)){
                    U.setMs(p.getProperty(y));
                }
            });
            System.out.println(U);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
