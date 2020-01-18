package demo1;

public class text {

    public static void main(String[] args) {
        Mythread mythread = new Mythread("PMDG");
        mythread.start();
        for (int i = 0; i <50 ; i++) {
            System.out.println(Thread.currentThread().getName()+"AS320");
        }
    }

}
