package text6;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class text {
    public static void main(String[] args) throws Exception {
        se();
    }
    public static void se() throws Exception{
        stu s1 = new stu("张三",20,"男");
        stu s2 = new stu("李四",22,"男");
        stu s3 = new stu("王五",24,"男");
        ArrayList <stu> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("stu.txt"));
        oos.writeObject(list);
    }
}
