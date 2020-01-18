package demo3;

public class student {
    private String name;
    private  Integer age;
    public void eat(){
        System.out.println("我在吃");
    }
    public void eat(String name){
        System.out.println(name+"在吃");
    }
    private void sleep(){
        System.out.println("我在睡");
    }
    private void sleep(String name){
        System.out.println(name+"在睡");
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
