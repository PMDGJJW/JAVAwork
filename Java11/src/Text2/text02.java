package Text2;

import java.util.Calendar;
import java.util.Date;

public class text02 {
    public static void main(String[] args) {
        Calendar calendar =  Calendar.getInstance();
        System.out.println(calendar.get(calendar.YEAR)+"-"+(calendar.get(calendar.MONTH)-1)+"-"+calendar.get(calendar.DATE));
       calendar.add(Calendar.DATE,500);
        System.out.println("500天后");
        System.out.println(calendar.get(calendar.YEAR)+"-"+(calendar.get(calendar.MONTH)-1)+"-"+calendar.get(calendar.DATE));
    }
}
