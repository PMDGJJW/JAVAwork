package text1;

public class Text1 {

    public static void main(String[] args) {
        Runnable T1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <5 ; i++) {
                    System.out.println("正在播放音乐");
                }
            }
        };
        Runnable T2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <5 ; i++) {
                    System.out.println("显示画面");
                }
            }
        };
        Thread X1= new Thread(T1);
        Thread X2= new Thread(T2);
        X1.start();
        X2.start();
    }

}
