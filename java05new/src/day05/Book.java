package day05;

public class Book {
    private String name;
    private String bname;
    private String ISBN;
    private int money;
    private String day;

    public Book() {
    }

    public Book(String name, String bname, String ISBN, int money, String day) {
        this.name = name;
        this.bname = bname;
        this.ISBN = ISBN;
        this.money = money;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
    public  void showBook(){
        System.out.println("最贵的书是：" + name + "," + bname + ","+ ISBN + ", " +  money + "," + day);
    }
}
