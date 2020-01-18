package day05;

public class Card {
    private String ds;
    private  String hs;

    public Card() {
    }

    public Card(String ds, String hs) {
        this.ds = ds;
        this.hs = hs;
    }

    public String getDs() {
        return ds;
    }

    public void setDs(String ds) {
        this.ds = ds;
    }

    public String getHs() {
        return hs;
    }

    public void setHs(String hs) {
        this.hs = hs;
    }
    public void showCard(){
        System.out.println(hs+ds);
    }
}
