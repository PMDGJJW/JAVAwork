public class Dog {
    private String name;
    private  int age;

    public Dog(){
    }
    public   Dog( String name,int age ){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return  name;
    }
    public void setName(){
        this.name=name;
    }
    public int getAge(){
        return  age;
    }
    public void setAge(){
        this.age=age;
    }
}
