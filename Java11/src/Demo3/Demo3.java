package Demo3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo3 {
    public static void main(String[] args) throws Exception {
        Date d = new Date();
        System.out.println(d);
        SimpleDateFormat dn = new  SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dstr =dn.format(d);
        System.out.println(dstr);
        String DS = "2020-10-25 14:25:36";
        DateFormat dnt = new  SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date SS = dnt.parse(DS);
        System.out.println(SS);
    }
}
