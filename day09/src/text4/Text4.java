package text4;

public class Text4 {
    public static void main(String[] args) {
        Animal d = new dog();
        Animal C= new Cat();
        d.eat();
        C.eat();
      if (d instanceof dog){
        dog D = (dog) d;
        D.lookhome();
      }
        if (C instanceof Cat){
            Cat c = (Cat) C;
            c.cth();
        }
    }
}
