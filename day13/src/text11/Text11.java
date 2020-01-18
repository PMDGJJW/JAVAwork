package text11;

import java.util.HashSet;
import java.util.Iterator;

public class Text11 {

    public static void main(String[] args) {
        HashSet<students> hset = new HashSet<>();
        hset.add(new students("马云",20,"man"));
        hset.add(new students("马云1",21,"man"));
        hset.add(new students("马云2",22,"man"));
        hset.add(new students("马云",20,"man"));
        hset.add(new students("马云3",23,"man"));
        hset.add(new students("马云4",24,"man"));
        hset.add(new students("马云5",25,"man"));
        hset.add(new students("马云6",26,"man"));
        hset.add(new students("马云7",27,"man"));
        hset.add(new students("马云8",28,"man"));
        Iterator it = hset.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("---------------------------------------------------");
        for (students stu:hset){
            System.out.println(stu);
        }
    }
}
