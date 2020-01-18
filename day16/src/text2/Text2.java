package text2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Text2 {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        Mythread M1 = new Mythread();
        Mythread2 M2 = new Mythread2();
        Mythread3 M3 = new Mythread3();
        service.submit(M1);
        service.submit(M2);
        service.submit(M3);
    }

}
