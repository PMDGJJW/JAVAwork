package Demo2;

public class Demo2 {
    public static void main(String[] args) {
        String str=" ";
        long strs = System.currentTimeMillis();
//        for (int i = 0; i <100000 ; i++) {
//            str+=i;
//        }
        long stre = System.currentTimeMillis();
        System.out.println("str:"+(stre-strs));
        long strds = System.currentTimeMillis();
        StringBuilder str2 = new StringBuilder();
        for (int i = 0; i <3000000 ; i++) {
           str2.append(i);
        }
        long strde = System.currentTimeMillis();
        System.out.println("str2:"+(strde-strds));

        long strfs = System.currentTimeMillis();
        StringBuffer str3 = new StringBuffer();
        for (int i = 0; i <3000000 ; i++) {
            str2.append(i);
        }
        long strfe = System.currentTimeMillis();
        System.out.println("str3:"+(strfe-strfs));
    }
}
