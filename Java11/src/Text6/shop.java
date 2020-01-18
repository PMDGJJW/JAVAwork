package Text6;

public class shop {
    private String id;
    private String name;
   private double price;
   private  String pp;

    public shop() {
    }

    public shop(String id, String name, double price, String pp) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.pp = pp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPp() {
        return pp;
    }

    public void setPp(String pp) {
        this.pp = pp;
    }
}
