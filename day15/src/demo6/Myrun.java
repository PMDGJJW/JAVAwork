package demo6;

public class Myrun implements Runnable {
    private ob ob;

    public Myrun(demo6.ob ob) {
        this.ob = ob;
    }

    @Override
    public void run() {
        synchronized (ob){
            for (int i = 0; i <10 ; i++) {
                System.out.println("i: "+ i);
                try {
                    ob.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
