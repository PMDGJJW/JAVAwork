package demo1;

public class Mythread extends Thread{
    public Mythread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i <50 ; i++) {
            System.out.println(Thread.currentThread().getName()+"    ：pmdg737");

        }
    }
}
