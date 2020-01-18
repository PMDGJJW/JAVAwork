package text4;

public class Text4 {

    public static void main(String[] args) {
        Mythread J = new Mythread();
        Thread Q1 = new Thread(J,"前门");
        Thread Q2 = new Thread(J,"中门");
        Thread Q3 = new Thread(J,"后门");
        Q1.start();
        Q2.start();
        Q3.start();
    }

}
