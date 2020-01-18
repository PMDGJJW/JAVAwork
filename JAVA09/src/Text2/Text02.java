package Text2;

public class Text02  {
    public static void main(String[] args) {
        BB b = new BB();
        b.A();
        b.showB10();
        b.showC10();
    }
}
class BB implements AA{
    @Override
    public void A() {
        System.out.println("AAAA");
    }
}
