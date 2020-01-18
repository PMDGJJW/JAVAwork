package text5;

public class spsu extends student implements sport {
    public spsu() {
    }

    public spsu(String name, int age) {
        super(name, age);
    }

    @Override
    public void playbsk() {
        System.out.println( "年龄为："+getAge()+"的"+getName()+"学生"+"在打篮球" );
    }
}
