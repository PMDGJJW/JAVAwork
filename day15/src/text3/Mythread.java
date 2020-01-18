package text3;



public class Mythread implements Runnable {

    int num = 1;

    @Override
    public void run() {
        while (true){
            synchronized (this){
            if (num>=100){
                System.out.println("水杯已经卖完了");
                break;
            }
            System.out.println(Thread.currentThread().getName()+"正在卖"+num+"个水瓶"+
                    " , 目前还剩下"+(100-num)+"个水瓶");
            num++;
            }
        }

    }
}
