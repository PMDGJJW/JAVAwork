package text3;

public class Text3 {
    public static void main(String[] args) {
    OldPhone O = new OldPhone();
    NewPhone n = new NewPhone();
    O.call();
    O.sendMessage();
    n.call();
    n.sendMessage();
    n.playGame();
    }
}
