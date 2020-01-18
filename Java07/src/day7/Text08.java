package day7;

public class Text08 {
    public static void main(String[] args) {
        String str = "javajﬁewjavajﬁowfjavagkljjava";
        int count2 = getcound(str,"java");
      System.out.println("字符串java的数量:"+count2);
    }
    public static int  getcound(String s,String ch){
    int count=0;
    while (s.indexOf(ch) !=-1){
        int index=s.indexOf(ch);
         s = s.substring(index + ch.length());
         count++;
    }
    return count;
    }
}
