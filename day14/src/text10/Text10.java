package text10;

import java.util.HashMap;

public class Text10 {

    public static void main(String[] args) {
        String [] Sheng ={"黑龙江省","浙江省","江西省","广东省","福建省"};
        String [] mid ={"哈尔滨","杭州","南昌","广州","福州"};
        HashMap<String,String> map = new HashMap<>();
        for (int i = 0; i <Sheng.length ; i++) {
            map.put(String.valueOf(Sheng[i]),String.valueOf(mid[i]));
        }
        System.out.println(map);
    }
}
