package Demo2;

public class Dtext02 {

    public static void main(String[] args) {
        dep d = new dep() {
            @Override
            public void depature() {
                System.out.println("离场程序JB01A");
            }
        };
        d.depature();
    }
}
