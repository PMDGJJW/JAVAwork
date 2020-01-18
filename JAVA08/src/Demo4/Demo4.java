package Demo4;

public class Demo4 {
    public static void main(String[] args) {
        zi z = new zi();
        z.method();
        System.out.println("------------------");
    }
}
class Fu{
   public void eat(){
       System.out.println("FU--吃饭");
   }

}
class zi extends Fu{
    public  void eat(){
        System.out.println("ZI--吃饭");
    }
    public void method(){
        super.eat();
        this.eat();
    }
}
