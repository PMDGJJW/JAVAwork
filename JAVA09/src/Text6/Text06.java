package Text6;

public class Text06 {
    public static void main(String[] args) {
        Company C= new Company(1000000);
        Manager m = new Manager("张小强",9000);
        Coder c = new Coder("李小亮",5000);

//        C.paySalary();
        C.paySalary(m);
        C.paySalary(c);
    }
}
class Manager extends Employee{
    public Manager() {
    }

    public Manager(String name, int age) {
        super(name, age);
    }
}
class Coder extends Employee{
    public Coder() {
    }

    public Coder(String name, int age) {
        super(name, age);
    }
}