public class MyDate {
    private int year;
    private int date;
    private int month;


    public MyDate(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
    public void showDate(){
        System.out.println("日期"+year+"年"+month+"月"+date+"日");
    }
    public void isBi(){
        if (year%400!=0){
            System.out.println(year+"年"+"不是闰年");
        }
    }
}
