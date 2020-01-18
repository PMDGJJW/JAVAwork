package day06.day06W;

public class Worker {
    private String ID;
    private String name;
    private  int age;

    public Worker() {
    }

    public Worker(String ID, String name, int age) {
        this.ID = ID;
        this.name = name;
        this.age = age;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public  void  show(){
        System.out.println(ID+","+name+","+age);
    }
}
