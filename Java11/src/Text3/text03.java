package Text3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class text03 {

    public static void main(String[] args) throws Exception {
        Date date = new Date();
        SimpleDateFormat sb= new SimpleDateFormat("yyyy-MM-dd");
       String DATE = sb.format(date);
        System.out.println(DATE);
        String Mybirth = "1999-06-10";
         Date mybirthday= sb.parse(Mybirth);
        System.out.println("生日："+Mybirth);
        long datenum = date.getTime();
        long mybirthdayenum = mybirthday.getTime();
        long liveday =datenum - mybirthdayenum;
        System.out.println(liveday/24/3600/1000);
    }
}
