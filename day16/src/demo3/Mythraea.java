package demo3;

public class Mythraea implements Runnable {
    @Override
    public void run() {
        System.out.println("我需要一名教练");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("教练来了: ，"+Thread.currentThread().getName());
        System.out.println("教我游泳游完后，教练回到了游泳池");
    }
}
