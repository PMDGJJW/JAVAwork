package demo3;

import java.lang.reflect.Method;

public class Demo {
    public static void main(String[] args)  throws Exception{

        Class c = student.class;
        Method method = c.getMethod("eat");
        System.out.println(method);
        method.invoke(new student());
        Method method1 = c.getMethod("eat",String.class);
        method1.invoke(new student(),"fsx");
        Method method2 = c.getDeclaredMethod("sleep");
        method2.setAccessible(true);
        method2.invoke(new student());
        Method method3 = c.getDeclaredMethod("sleep",String.class);
        method3.setAccessible(true);
        method3.invoke(new student(),"jjw");
    }
}
