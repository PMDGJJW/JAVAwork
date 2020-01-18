package text15;

public class Text15 {

    public static void charAt(String str, int index){
        try {
            str.equals(null);
        }catch (Exception e){
            System.out.println("字符串不能为null");
        }
        try {
            str.charAt(0);
        } catch (Exception e) {
            System.out.println("字符串不能为空");
        }
       if (index<0||index>str.length()-1){
           throw new ArrayIndexOutOfBoundsException("索引越界");


       }

    }
    public static void testTryCatch(){
        charAt("jj",3);
    }
    public static void testThrows(){
        charAt(null,1);
    }
    public static void main(String[] args) {
    testTryCatch();
    testThrows();
    }
}
