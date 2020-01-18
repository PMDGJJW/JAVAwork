package text7;

import text6.stu;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class text {
    public static void main(String[] args) {
        show();
    }
    public static void show(){
        ArrayList<stu> list = new ArrayList<>();
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("stu.txt"));
           list=(ArrayList<stu>) ois.readObject();
           list.stream().forEach(n->{
               System.out.println(n);
           });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
