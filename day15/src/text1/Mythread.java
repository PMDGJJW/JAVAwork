package text1;

public class Mythread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println("正在播放背景音乐");
        }

    }
}
