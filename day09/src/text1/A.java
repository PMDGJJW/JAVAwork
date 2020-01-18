package text1;

public interface  A {
    void A();
    public default void B(){
        System.out.println("BBBB");
    }
}
