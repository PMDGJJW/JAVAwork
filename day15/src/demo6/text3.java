package demo6;

public class text3  {

    public static void main(String[] args) {
        ob o = new ob();
        Myrun M1 = new Myrun(o);
        Myrun2 M2 = new Myrun2(o);
        Thread T1 = new Thread(M1);
        Thread T2 = new Thread(M2);
        T1.start();
        T2.start();
    }

}
