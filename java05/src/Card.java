public class Card {
    private String hs;
    private String ph;
    public Card( String hs,String ph ){
        this.hs=hs;
        this.ph=ph;
    }
    public void pk(){
        System.out.println( hs + ph);
    }

}
