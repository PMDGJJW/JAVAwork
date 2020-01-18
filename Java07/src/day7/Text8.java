package day7;

public class Text8 {
    public static void main(String[] args) {
        String str ="[User{name=马云, age=56, money=2500.0}, User{name=马化腾, age=56, money=2400.0}, User{name=马赛克, age=56, money=2500.0}]";
        String  str3=str.replace("User{","");
        String str4 = str3.replace("[","");
        System.out.println(str3);
        String [] str2= str4.split("name=");
       for (int x=0; x<str2.length;x++){
          String[] str6=str2[x].split(",");
           System.out.println(str6[0]);
        }
    }
}
