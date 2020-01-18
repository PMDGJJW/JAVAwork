package demo4;

public class baoz {

    public static void main(String[] args) {
        bz b = new bz(0);

        mythread m = new mythread(b);
        eat e = new eat(b);

        Thread T1 = new Thread(m);
        Thread T2 = new Thread(e);
        T1.start();
        T2.start();

    }

}
