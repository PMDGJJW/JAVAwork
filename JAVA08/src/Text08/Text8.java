package Text08;

import java.util.ArrayList;

public class Text8 {
    public static void main(String[] args) {
        QunZhu q = new QunZhu("老板",300);
        ChengYuan C1= new ChengYuan("张三",0);
        ChengYuan C2= new ChengYuan("历史",50);
        ChengYuan C3= new ChengYuan("王五",100);
        ArrayList list = q.fa(400,3);
        if (list.size()==0){
            System.out.println(q.getName()+"的余额不足");
        }
        else {
            q.show();
        }
        C1.shou(list);
        C2.shou(list);
        C3.shou(list);
        C1.show();
        C2.show();
        C3.show();
    }
}
abstract class User{
    private String name;
    private double money;
    public abstract void show();

    public User() {
    }

    public User(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
class QunZhu extends User{
    public QunZhu() {
    }
    public QunZhu(String name, double money) {
        super(name, money);
    }
    @Override
    public void show() {
        System.out.println("群主:"+getName()+",余额"+getMoney());
    }
    public  ArrayList<Double> fa(double famoney ,int rednum){
        double newmoney = getMoney()-famoney;
        setMoney(newmoney);
        ArrayList<Double>list = new ArrayList<>();
        if (newmoney>0){
            double redmoney =  famoney /rednum;
            for (int i=0;i<rednum;i++){
                list.add(redmoney);
            }

        }
        return list;
    }
}
class ChengYuan extends User{
    public ChengYuan() {
    }
    public ChengYuan(String name, double money) {
        super(name, money);
    }
    public void shou(ArrayList<Double> list){
        if (list.size()==0){

        }
        else {
            double cmoney = list.remove(0);
            double newcmoney = getMoney()+cmoney;
            setMoney(newcmoney);
        }
    }
    @Override
    public void show() {
        System.out.println("成员:"+getName()+",余额"+getMoney());
    }
}