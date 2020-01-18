package Demo2;
public class Demo2 {
    public static void main(String[] args)
     {
         Zi zi=new Zi();zi.method1(); }   }
          class Fu{  int num1=10;
}
class Zi extends Fu {
    int num1 = 20;

    public void method1() {
        System.out.println("父类的： " + num1);
        System.out.println("子类的： " + num1);
    }
}