package text8;

import text6.stu;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Text {
    public static void main(String[] args) throws Exception {
        se();
    }
    public static void se() throws Exception{
        stu s1 = new stu("张三",20,"男");
        stu s2 = new stu("李四",22,"男");
        stu s3 = new stu("王五",24,"男");
        ArrayList<stu> list = new ArrayList<>();
        ArrayList<stu> result = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("stus.txt"));
        oos.writeObject(list);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("stus.txt"));
        result = (ArrayList<stu>) ois.readObject();
        result.stream().forEach(n->{
            System.out.println(n);
        });
    }
}
