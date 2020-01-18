package Text2;

public class Text2 {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        d.name="旺财";
        d.eat();
        d.lookhome();
        c.name="波斯猫";
        System.out.println("----------------------");
        c.eat();
        c.catchMouse();

    }
}
