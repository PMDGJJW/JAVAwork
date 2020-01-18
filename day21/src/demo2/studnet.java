package demo2;

public class studnet {
    private  String name;
    private Integer age;

    public studnet() {
    }

    public studnet(String name) {
        this.name = name;
    }
    private studnet(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public studnet(Integer age){
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
