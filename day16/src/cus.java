public class cus implements Runnable {

    private baozi baozi;

    public cus(baozi baozi) {
        this.baozi = baozi;
    }

    @Override
    public void run() {

        while (true){
            synchronized (baozi){
                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int num = baozi.getNum();
                    if (num<10){
                        num++;
                        baozi.setNum(num);
                        System.out.println("现在只有"+baozi.getNum()+"个，肉夹馍， 肉夹馍快没了，老板叫"+Thread.currentThread().getName()+"做了一个肉夹馍");
                    }
                    else {
                        baozi.setFlag(1);
                        try {
                            baozi.wait();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    if (baozi.getFlag()==0){
                        baozi.notify();
                    }
            }
        }
    }
}
