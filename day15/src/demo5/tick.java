package demo5;

public class tick implements Runnable {

    private tickEv tkv;

    public tick(tickEv tkv) {
        this.tkv = tkv;
    }
    @Override
    public void run() {
        while (true) {
            synchronized (tkv) {
                int num = tkv.getNum();
                if (num <= 0) {
                    System.out.println("票卖完了");
                    break;
                }
                System.out.println(Thread.currentThread().getName() + "窗口： " + " ， 卖"+tkv.getName()+"票" + num);
                tkv.setNum(--num);
            }
        }
    }
}
