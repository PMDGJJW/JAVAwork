package Demo3;

public class Dtext03 {

    public static void main(String[] args) {
        Swimable Sm = getswimer();
        Sm.swiming();

    }
    public  static Swimable getswimer(){

        ss s = new ss();

        st t =new st();
        return s;
    }
}
class ss implements Swimable{
    @Override
    public void swiming() {
        System.out.println("会游泳的学生");
    }
}
class st implements Swimable{
    @Override
    public void swiming() {
        System.out.println("会游泳的老师");
    }
}