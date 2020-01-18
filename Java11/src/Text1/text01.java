package Text1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class text01 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat ds = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       String myday = ds.format(date);
        System.out.println("当前时间为："+myday);

    }
}
