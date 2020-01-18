public class text5 {
    public static void main(String[] args) {
        int a=10;
        int b=10;
        int c=10;
        a = b++;
        c = --a;
        b = ++a;
        a = c--;
        System.out.println(a);//9
        System.out.println(b);//11
        System.out.println(c);//9
    }
}
