package Text7;

import java.util.ArrayList;

public class Text07 {
    public static void main(String[] args) {
        Laptop l = new Laptop("g10000","笔记本",10000.0);
        phone p =new phone("g10001","手机",5000.0);
        Fruit f = new Fruit("g200000","苹果",50.0);
        GouWuChe G = new GouWuChe();
        System.out.println("==============添加商品==============");
        G.addGoods(l);
        G.addGoods(p);
        G.addGoods(f);
        System.out.println("========打印商品===============");
        G.showgoods();
        System.out.println("-----------------------------------");
        G.jiesuan();
    }
}
class phone extends EGoods{
    public phone() {
    }

    public phone(String id, String name, double price) {
        super(id, name, price);
    }
}
class Laptop extends EGoods{
    public Laptop() {
    }

    public Laptop(String id, String name, double price) {
        super(id, name, price);
    }
}
class Fruit extends Goods{
    public Fruit() {
    }

    public Fruit(String id, String name, double price) {
        super(id, name, price);
    }
}