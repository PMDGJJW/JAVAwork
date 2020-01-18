package demo3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo3 {
    public static void main(String[] args) {
        Mythraea m = new Mythraea();
        ExecutorService service = Executors.newFixedThreadPool(2);
        System.out.println("----------------------------");
        service.submit(m);
        System.out.println("----------------------------");
        service.submit(m);
        service.submit(m);
    }

}
