package demo4;

public class Demo4 {
    public static void main(String[] args) {
        Myt m1= new Myt( );
        Thread A1 = new Thread(m1,"ghz");
        Thread A2 = new Thread(m1,"shz");
        Thread A3 = new Thread(m1,"wh");
        A1.start();
        A2.start();
        A3.start();
    }

}
