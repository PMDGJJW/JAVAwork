package demo1;

public class deno {

    public static void main(String[] args) {
        System.out.println(sum(100));

    }
    public static  int sum(int a){

        if (a<=0){
            return 0;
        }

      return (a+sum(--a));
    };

}
