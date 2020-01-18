package text21;

public class NomoneyExption extends RuntimeException{
    public NomoneyExption() {
    }

    public NomoneyExption(String message) {
        super(message);
    }
}
