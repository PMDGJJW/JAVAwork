package Text3;

public class Text03 {
    public static void main(String[] args) {
        oldphone o = new oldphone();
        o.call();
        o.sendMessage();
        newphone n = new newphone();
        n.call();
        n.sendMessage();
        n.playGmame();

    }
}
class oldphone{
    public void call(){
        System.out.println("旧手机打电话");
    }
    public void sendMessage(){
        System.out.println("旧手机发短息");
    }
}
class  newphone extends oldphone implements play{
    @Override
    public void call() {
        System.out.println("新手机打电话");
    }

    @Override
    public void sendMessage() {
        System.out.println("新手机发短息");
    }

    @Override
    public void playGmame() {
        System.out.println("新手机打游戏");
    }
}
