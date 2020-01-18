package demo5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class demo {
    public static void main(String[] args) throws Exception{
        user u = new user("张三",20);
        user u1 = new user("张三",20);
        user u2 = new user("张三",20);
        ArrayList <user>list = new ArrayList<>();
        ArrayList<user> result = new ArrayList<>();
        list.add(u);
        list.add(u1);
        list.add(u2);
        ObjectOutputStream oos  = new ObjectOutputStream(new FileOutputStream("d:\\demo\\usser.txt"));
        oos.writeObject(list);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:\\demo\\usser.txt"));
        result = (ArrayList<user>) ois.readObject();
        result.forEach(n->{
            System.out.println(n);
        });
    }
}
