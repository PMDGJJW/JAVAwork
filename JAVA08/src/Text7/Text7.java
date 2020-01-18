package Text7;

public class Text7 {
    public static void main(String[] args) {
         Teacher J = new Teacher();
        AdminStaff a= new AdminStaff();
        Lecturer l= new Lecturer(666,"傅红雪");
        Tutor O= new Tutor(668,"顾棋");
        Maintainer m= new Maintainer(686,"庖丁");
        Buyer b= new Buyer(888,"景甜");
        l.work();
        O.work();
        m.work();
        b.work();
    }
}
abstract class Employee {
    private int id;
    private  String name;
    public abstract void work();

    public Employee() {
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
 class Teacher extends Employee{
    @Override
    public void work() {
        System.out.println("工号为"+getId()+"的讲师"+getName()+"在讲课");

    }
    public Teacher() {
    }

    public Teacher(int id, String name) {
        super(id, name);
    }

}
class AdminStaff extends Employee{
    @Override
    public void work() {
        System.out.println("工号为"+getId()+"的讲师"+getName()+"在讲课");

    }
    public AdminStaff() {
    }

    public AdminStaff(int id, String name) {
        super(id, name);
    }

}
 class Lecturer extends Teacher{
    public Lecturer() {
    }

    public Lecturer(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("工号为"+getId()+"的讲师"+getName()+"在讲课");

    }
}
class Tutor extends Teacher{
    public Tutor() {
    }

    public Tutor(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("工号为"+getId()+"的助教"+getName()+"在帮助学生解决问题");
    }
}
 class Maintainer extends AdminStaff{
    public Maintainer() {
    }

    public Maintainer(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("工号为"+getId()+"的维修人员"+getName()+"在帮助不能共享屏幕问题");
    }
}

 class Buyer extends AdminStaff{
    public Buyer() {
    }

    public Buyer(int id, String name) {
        super(id, name);
    }
    @Override
    public void work() {
        System.out.println("工号为"+getId()+"的采购人员"+getName()+"在采购音响设备");
    }
}
