public class ticktext {

    public static void main(String[] args) {
        ticket t = new ticket("广州---北京",100);
        Mythread  m = new Mythread(t);
        Thread t1 = new Thread(m,"窗口A");
        Thread t2 = new Thread(m,"窗口B");
        Thread t3 = new Thread(m,"窗口C");
        t1.start();
        t2.start();
        t3.start();
    }

}
