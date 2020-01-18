package day05;

public class Text02 {
    public static void main(String[] args) {
        Student s=new Student();
        Teacher t=new Teacher();
        s.setAge(18);
        s.setName("韩同学");
        t.setName("周老师");
        t.setAge(30);
        t.eat();
        s.setContent("java");
        t.setContent("java");
        t.study();
        s.eat();
        s.study();
    }

}
