package demo4;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class demo {

    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("name","fsx");
        properties.setProperty("takeoff","zbaa");
        properties.setProperty("land","zggg");
        Set<String> n  = properties.stringPropertyNames();
        for (String ke : n){
            System.out.println(ke+"  , "+properties.getProperty(ke));
        }
        n.stream().forEach(x->{
            System.out.println(x+" , "+properties.getProperty(x));
        });
        Iterator <String>it= n.iterator();
        while (it.hasNext()){
            String key = it.next();
            System.out.println(key+" , "+ properties.getProperty(key));
        }
    }

}
