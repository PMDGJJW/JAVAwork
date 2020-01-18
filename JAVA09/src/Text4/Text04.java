package Text4;

public class Text04 {
    public static void main(String[] args) {
        Animal D = new DOG();
        Animal C = new CAT();
        D.eat();
        C.eat();
        if (D instanceof DOG){
            DOG d =  (DOG) D;
            d.lookHome();
        }
         if (C instanceof CAT
        ){
            CAT c = (CAT) C;
            c.catchMouse();
        }
    }
}
class DOG extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
    public void  lookHome(){
        System.out.println("老老实实看家");
    }
}
class CAT extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public void catchMouse(){
        System.out.println("努力捉老鼠");
    }
}