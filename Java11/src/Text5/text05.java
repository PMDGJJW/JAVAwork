package Text5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class text05 {

    public static void main(String[] args) throws Exception {
        String str="2016-12-18";
        SimpleDateFormat SB = new SimpleDateFormat("yyyy-MM-dd");
        Date date = SB.parse(str);
        SimpleDateFormat nsb = new SimpleDateFormat("yyyy年MM月dd日");
        String ndate = nsb.format(date);
        System.out.println(ndate);
    }
}
