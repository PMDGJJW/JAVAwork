public class Book {
    private String name;
    private  String bookname;
    private String ISBN;
    private double price;
    private String date;

    public Book(){

    }
    public Book( String name,String bookname,String ISBN,String date,double price ){
        this.name=name;
        this.bookname=bookname;
        this.ISBN=ISBN;
        this.date=date;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }



}
