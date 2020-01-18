package Demo1;

public class DemoText1 {
    public static void main(String[] args) {
        Teacher T = new Teacher();
        T.name = "小张";
        T.age = 20;
        T.eat();
        T.sleep();
        T.teach();

        coder c =new coder();
        c.name = "小张";
        c.age = 20;
        c.eat();
        c.sleep();
        c.coding();
    }
}