package Demo3;

public class Demo3 {
    public static void main(String[] args) {
        zi z = new zi();
        System.out.println("------------------");
    }
}
class Fu{
    private int num = 10;

    public Fu() {
        System.out.println("F无参构造");
    }

    public Fu(int num) {
        System.out.println("Fu有参构造");
    }
}
class zi extends Fu{
    private int num = 20;

    public zi() {
        System.out.println("zi无参构造");
//        System.out.println(this.num+",");
    }

    public zi(int num) {
        System.out.println("zi有参构造");
    }
}