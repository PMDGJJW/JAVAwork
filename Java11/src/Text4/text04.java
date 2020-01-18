package Text4;

public class text04 {

    public static void main(String[] args) {
        String str = "";
       long stare =  System.currentTimeMillis();
        for (int i = 0; i <10000 ; i++) {
            str+=i;
        }
       long end =  System.currentTimeMillis();
        System.out.println("str:"+(end-stare));
        StringBuilder str1 = new StringBuilder();
        long stare1 =  System.currentTimeMillis();
        for (int i = 0; i <100000 ; i++) {
            str1.append(i);
        }
        long end1 =  System.currentTimeMillis();
        System.out.println("StringBuilder:"+(end1-stare1));
    }
}
