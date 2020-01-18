public class text {

    public static void main(String[] args) {
        baozi b = new baozi("包子",0,0);
        cus c = new cus(b);
        product p = new product(b);
        new Thread(c,"小二").start();
        new Thread(p,"猪八戒").start();
    }

}
