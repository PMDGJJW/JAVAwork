package text2;

public interface AA {
    void showAA();
    public default void show10(String str){
        for (int i = 0; i <10 ; i++) {
            System.out.print(str+" ");
        }
    }
    public default void ShowB10(){
        show10("BBBB");
        System.out.println(" ");
    }
    public default void ShowC10(){
        show10("CCCC");
        System.out.println(" ");
    }
}
