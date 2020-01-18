package demo4;

public class Myt implements Runnable {
    int num=100;

    @Override
    public void run() {

       while (true){
           synchronized (this){
               if (num<=0){
                   System.out.println("票卖完了");
                   break;
               }
                   System.out.println(Thread.currentThread().getName()+"窗口： "+ " ， 卖票：" +num);
               num--;
           }

       }
    }
}
