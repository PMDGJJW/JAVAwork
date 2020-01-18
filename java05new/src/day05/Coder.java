package day05;

public class Coder {
    private String name;
    private  String gnum;
    private  int price;

    public Coder() {
    }

    public Coder(String name, String gnum, int price) {
        this.name = name;
        this.gnum = gnum;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGnum() {
        return gnum;
    }

    public void setGnum(String gnum) {
        this.gnum = gnum;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void intro(){
        System.out.println("程序员姓名："+name);
        System.out.println("工号："+gnum);

    }
    public  void showSalary(){
        System.out.println("基本工资"+price);
    }
    public  void work(){
        System.out.println("正在努力的写代码. ");
        System.out.println("==============================================");
    }
}
