package text3;

public class Text3 {

    public static void main(String[] args) {
        Mythread T = new Mythread();
        Thread X1 = new Thread(T,"实体店");
        Thread X2 = new Thread(T,"官网");
        X1.start();
        X2.start();
    }

}
