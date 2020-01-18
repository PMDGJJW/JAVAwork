package Demo1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class demo1 {

    public static void main(String[] args) {
        String [] str = new String[]{"1","2","3","4","5"};
        String [] str1 = new String[]{"9","8","7","6","5"};
        System.arraycopy(str,2,str1,0,3);
        System.out.println(Arrays.toString(str1));
    }
}
