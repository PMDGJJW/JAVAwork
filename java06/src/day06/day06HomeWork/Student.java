package day06.day06W;

public class Student {
    private String num;
    private  String name;
    private  double height;

    public Student() {
    }

    public Student(String num, String name, double height) {
        this.num = num;
        this.name = name;
        this.height = height;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
