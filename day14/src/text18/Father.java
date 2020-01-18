package text18;

public class Father  {
    public void eat() throws ToothPainException{
       throw new ToothPainException("吃到吃到一个石子\n") ;
    }
    public void drink() {
        System.out.println("喝什么都没有问题");
    }
}
