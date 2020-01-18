package demo5;

public class Demo5 {

    public static void main(String[] args) {
        tickEv m = new tickEv("ZBAA-ZGGG",100);
        tick m1 = new tick(m);
        Thread t3 = new Thread(m1,"拼多多");
        Thread t2 = new Thread(m1,"京东");
        Thread t1 = new Thread(m1,"淘宝");
      t1.start();
      t2.start();
      t3.start();
    }
}
