package demo4;

public class eat implements Runnable {

    private bz z;

    public eat(bz z) {
        this.z = z;
    }

    @Override
    public void run() {

        while (true){

            synchronized (z){
                try {
                    Thread.sleep(800);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (z.getFlag()==1){
                    System.out.println("有包子了。吃包子");
                    z.setFlag(0);
                   z.notify();
                }
                else {
                    try {
                        z.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
