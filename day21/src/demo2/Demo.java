package demo2;

import java.lang.reflect.Constructor;

public class Demo {
    public static void main(String[] args)throws Exception {
//        Class C = studnet.class;
//        System.out.println(C);
        Class C1 = Class.forName("demo2.studnet");
//        System.out.println(C1);
        Constructor<studnet> constructor = C1.getDeclaredConstructor(String.class,Integer.class);
        constructor.setAccessible(true);
        System.out.println(constructor);
        Constructor<studnet> constructor2 = C1.getDeclaredConstructor(String.class);
        System.out.println(constructor2);
        studnet s1 = constructor.newInstance("ss",20);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        studnet s2 = constructor2.newInstance("fsx");
        System.out.println(s2.getName());

    }
}
