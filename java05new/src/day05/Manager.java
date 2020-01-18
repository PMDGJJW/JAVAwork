package day05;

public class Manager {
    private String name;
    private  int gnum;
    private  int price;
    private  int jprice;

    public Manager() {
    }

    public Manager(String name, int gnum, int price, int jprice) {
        this.name = name;
        this.gnum = gnum;
        this.price = price;
        this.jprice = jprice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGnum() {
        return gnum;
    }

    public void setGnum(int gnum) {
        this.gnum = gnum;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getJprice() {
        return jprice;
    }

    public void setJprice(int jprice) {
        this.jprice = jprice;
    }
    public void intro(){
        System.out.println("经理姓名："+name);
        System.out.println("工号："+gnum);

    }
    public  void showSalary(){
        System.out.println("基本工资"+price+"奖金为："+jprice);
    }
    public  void work(){
        System.out.println("正在努力的做着管理工作,分配任务,检查员工提交上来的代码..... ");
        System.out.println("==============================================");
    }
}
