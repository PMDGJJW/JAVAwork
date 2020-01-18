public class Demo {

    public static void main(String[] args) {
        Demo1 p=new Demo1();
        System.out.println("品牌"+p.brand);
        System.out.println("品牌"+p.price);
        System.out.println("品牌"+p.color);
        p.brand="华为";
        p.price=2999;
        p.color="华1为";
        System.out.println("品牌"+p.brand);
        System.out.println("品牌"+p.price);
        System.out.println("品牌"+p.color);
        p.call("刘德华");
        p.sendMessage();
    }
}
