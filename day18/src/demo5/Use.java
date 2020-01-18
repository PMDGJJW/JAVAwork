package demo5;

public class Use {

    private  String name;
    private  String age;
    private  String ms;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMs() {
        return ms;
    }

    public void setMs(String ms) {
        this.ms = ms;
    }

    @Override
    public String toString() {
        return "Use{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", ms='" + ms + '\'' +
                '}';
    }
}
