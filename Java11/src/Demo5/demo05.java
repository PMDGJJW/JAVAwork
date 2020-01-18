package Demo5;

public class demo05 {

    public static void main(String[] args) {
        person p1 = new person("马云",50);
        person p2 = new person("马云",50);
        String S1 ="hellow";
        String S2 ="hellow";
        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));
        System.out.println(S1==S2);
        System.out.println(S1.equals(S2));
    }
}
