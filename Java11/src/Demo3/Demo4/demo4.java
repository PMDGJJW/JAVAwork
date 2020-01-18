package Demo3.Demo4;

import java.util.Calendar;

public class demo4 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(calendar.YEAR,-2);
        calendar.set(calendar.YEAR,2050);
      int year =  calendar.get(calendar.YEAR);
      int year1 =  calendar.get(calendar.MARCH);
      int year2 =  calendar.get(calendar.DAY_OF_MONTH);
      int year3 =  calendar.get(calendar.DAY_OF_WEEK);
      int year4 =  calendar.get(calendar.DATE);
        System.out.println(year);
        System.out.println(year1+1);
        System.out.println(year2);
        System.out.println(year3-1);
        System.out.println(year4);
    }
}
