package demo6;

public class Myrun2 implements Runnable {
    private  ob ob;

    public Myrun2(demo6.ob ob) {
        this.ob = ob;
    }

    @Override
    public void run() {

            while (true){
                synchronized (ob){
                ob.notify();
            }
        }
    }
}
