package Text6;

public class Text6 {
    public static void main(String[] args) {
        Mananger m= new Mananger("老王","m100",10000);
        cooker c = new cooker("小王","c100",6000);
        m.work();
        m.man();
        c.work();
        c.cok();
    }
}
abstract class worker{
    private String name;
    private String id;
    private int price;
    public abstract  void work();

    public worker() {
    }

    public worker(String name, String id, int price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
class Mananger extends worker{
    public Mananger() {
    }

    public Mananger(String name, String id, int price) {
        super(name, id, price);
    }

    @Override
    public void work() {
        System.out.println("工号为："+getId()+"姓名为："+getName()+"工资为"+getPrice()+"的经理在吃鱼");
    }
    public void man(){
        System.out.println("工号为："+getId()+"姓名为："+getName()+"工资为"+getPrice()+"的经理正在工作，管理其他人");
    }
}
class cooker extends worker{
    public cooker() {
    }

    public cooker(String name, String id, int price) {
        super(name, id, price);
    }

    public void work() {
        System.out.println("工号为："+getId()+"姓名为："+getName()+"工资为"+getPrice()+"的厨师在吃肉");
    }
    public void cok(){
        System.out.println("工号为："+getId()+"姓名为："+getName()+"工资为"+getPrice()+"的经理正在工作，炒菜");
    }
}