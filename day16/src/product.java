public class product implements Runnable {

    private baozi baozi;

    public product(baozi baozi) {
        this.baozi = baozi;
    }

    @Override
    public void run() {

        while (true){
            synchronized (baozi){
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int num = baozi.getNum();
                if (baozi.getNum()>= 5){
                    System.out.println("店铺还有"+baozi.getNum()+"个肉夹馍了"+Thread.currentThread().getName()+"吃一个肉夹馍");
                    num--;
                    baozi.setNum(num);
                }
          else  if (baozi.getFlag()==1&&baozi.getNum()<5){
                baozi.setFlag(0);
                    baozi.notify();

            }
            if (baozi.getFlag()==0){
                    try {
                        baozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        }
        }
    }
}
