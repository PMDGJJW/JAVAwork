package text5;

public class spth extends teacher implements sport {
    public spth() {
    }

    public spth(String name, int age) {
        super(name, age);
    }

    @Override
    public void playbsk() {
        System.out.println( "年龄为："+getAge()+"的"+getName()+"老师"+"在打篮球" );
    }
}
