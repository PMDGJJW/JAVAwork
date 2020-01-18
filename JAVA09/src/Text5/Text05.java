package Text5;

public class Text05 {
     static void goToSport(Sport sport  ){
         sport.playBasketball();
    }
    public static void main(String[] args) {

        Teacher T1 =new Teacher("马云",45);
        SportTeacher t2 =new SportTeacher("大姚",35);
        student s1 = new student("小王",20);
        SportStudent s2 = new SportStudent("王中王",21);
        goToSport(t2);
        goToSport(s2);

    }
}
class Teacher extends Person {
    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {

    }

}
class SportTeacher extends Teacher implements Sport{
    public SportTeacher() {
    }

    public SportTeacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void playBasketball() {
        System.out.println("年龄为"+getAge()+"岁的"+getName()+"老师在打篮球");
    }
}
class student extends Person{
    public student() {
    }

    public student(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {

    }
}
class SportStudent extends student implements Sport{
    public SportStudent() {
    }

    public SportStudent(String name, int age) {
        super(name, age);
    }

    @Override
    public void playBasketball() {
        System.out.println("年龄为"+getAge()+"岁的"+getName()+"学生在打篮球");
    }
}