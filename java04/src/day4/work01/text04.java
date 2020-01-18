package day4.work01;

public class text04 {
    public static void main(String[] args) {
        char aChar =getChar(69);
        System.out.println(aChar);
    }
    public  static char getChar(int a){
        char ch = (char) a;
        if (ch>'a'&&ch<'z'){
            return  ch;
        }
       else if (ch>'A'&&ch<'Z'){
            return  ch;
        }
        else if (ch>'0'&&ch<'9'){
            return  ch;
        }
        else {
            return ' ';
        }
    }
}
