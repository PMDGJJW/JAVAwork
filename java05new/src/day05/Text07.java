package day05;

public class Text07 {
    public static void main(String[] args) {
        Book K1 = new Book("No0003","JavaWed实战","ISBN265456",58,"2017 - 1 - 1");
        Book K2 = new Book("No0004","Jquery实战","ISBN4124124456",68,"2017 - 1 - 1");
        Book K3 = new Book("No0005","Vue实战","ISBN3542145456",98,"2017 - 1 - 1");
        Book K=K1;
        if (K1.getMoney()<K2.getMoney()){
            K=K2;
        }
        if (K2.getMoney()<K3.getMoney()){
            K=K3;
        }
        K.showBook();
    }
}
