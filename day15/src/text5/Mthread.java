package text5;

public class Mthread extends Thread {
    private price p;

    public Mthread(price p) {
        this.p = p;
    }

    @Override
    public void run() {
        while (true){
            synchronized (p){
            if (p.getPr()<=0){
                System.out.println("票卖完了哦");
                break;
            }
        System.out.println("当前窗口为："+Thread.currentThread().getName()+
                ",卖了一张票 "+",剩余票数为"+p.getPr());
            int num = p.getPr();
            num--;
            p.setPr(num);
        }
        }
    }

    public Mthread(String name) {
        super(name);
    }
}
