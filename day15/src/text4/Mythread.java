package text4;

public class Mythread implements Runnable {

    int num = 87;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (num <= 0) {
                    System.out.println("对不起，公交车满座了，请坐下一辆车");
                    break;
                }
                System.out.println(Thread.currentThread().getName() + "上车" +
                        " , 目前还剩下" + (num) + "个座位");
                num--;
            }
        }
    }
}
