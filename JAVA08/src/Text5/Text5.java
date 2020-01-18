package Text5;

public class Text5 {
    public static void main(String[] args) {
        chick c= new chick(2,"红色");
        duck d = new duck(1,"黑色");
        c.eat();
        c.ming();
        d.eat();
        d.swim();

    }
}
abstract class animous{

    private int  age;
    private String color;
   public   abstract  void eat();

    public animous() {
    }

    public animous(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
class chick extends animous{
    public chick() {
    }

    public chick(int age, String color) {
        super(age, color);
    }
    public void eat(){
        System.out.println(getAge()+"岁的"+getColor()+"的公鸡在啄米");
    }
    public void ming(){
        System.out.println(getAge()+"岁的"+getColor()+"的公鸡在打鸣");
    }
}
class duck extends animous{
    public duck() {
    }

    public duck(int age, String color) {
        super(age, color);
    }
    @Override
    public void eat() {
        System.out.println(getAge()+"岁的"+getColor()+"的鸭子在吃饭");
    }
    public void swim(){
        System.out.println(getAge()+"岁的"+getColor()+"的鸭子在游泳");
    }
}