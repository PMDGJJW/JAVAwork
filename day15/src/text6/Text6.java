package text6;

public class Text6 {

    public static void main(String[] args) {
        Runnable X1 = new Runnable() {
            @Override
            public void run() {
                int num = 1;
                for (int i = 1; i <=10 ; i++) {
                    num*=i;
                }
                System.out.println(Thread.currentThread().getName()+" : "+num);
            }
        };
        Runnable X2 = new Runnable() {
            @Override
            public void run() {
                int num = 1;
                for (int i = 1; i <=5 ; i++) {
                    num*=i;
                }
                System.out.println(Thread.currentThread().getName()+" : "+num);
            }
        };
        Runnable X3 = new Runnable() {
            @Override
            public void run() {
                int num = 1;
                for (int i = 1; i <=8 ; i++) {
                    num*=i;
                }
                System.out.println(Thread.currentThread().getName()+" : "+num);
            }
        };
        Thread ten = new Thread(X1,"线程：10!的结果为");
        Thread five = new Thread(X2,"线程：5!的结果为");
        Thread eight = new Thread(X3,"线程：8!的结果为");
        ten.start();
        five.start();
        eight.start();
    }

}
