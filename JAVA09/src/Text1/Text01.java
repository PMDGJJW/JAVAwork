package Text1;

public class Text01 {
    public static void main(String[] args) {
        B b =new B();
        b.showA();
        b.showB();

    }
}
class B implements  A{
    @Override
    public void showA() {
        System.out.println("AAAA");
    }
}