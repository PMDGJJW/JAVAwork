package Text1;

public class text01 {

    public static void main(String[] args) {
        HandleAble Hand = new HandleAble() {
            @Override
            public void HandleString(String num) {
                double ynum = Double.parseDouble(num);
                double znum = Math.floor(ynum);

                System.out.println("原数字为："+ynum);
                System.out.println("取整后为："+znum);
                System.out.println("保留四位小数后"+Math.floor(Math.round(ynum*10000))/10000);
            }

        };
        Hand.HandleString("23.23456789");
    }
}
