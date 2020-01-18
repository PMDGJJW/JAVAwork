package text2;

public class Mythread2  implements Runnable{

    int price = 1;
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 1; i <=5 ; i++) {
            price*=i;
        }
        System.out.println(price);
    }

}
