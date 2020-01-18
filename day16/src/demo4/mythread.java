package demo4;

public class mythread implements Runnable {

    private bz z ;

    public mythread(bz z) {
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
                if (z.getFlag()==0){
                    System.out.println("没包子了，做包子");
                    z.setFlag(1);
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
