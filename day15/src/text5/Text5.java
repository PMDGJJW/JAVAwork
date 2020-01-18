package text5;

public class Text5 {

    public static void main(String[] args) {
        price i = new price(20);
        Mthread X1 = new Mthread(i);
        Mthread X2 = new Mthread(i);
        Mthread X3 = new Mthread(i);
        X1.setName("窗口a");
        X2.setName("窗口b");
        X3.setName("窗口c");
        X1.start();
        X2.start();
        X3.start();
    }

}
