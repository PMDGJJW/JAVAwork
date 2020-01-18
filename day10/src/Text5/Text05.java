package Text5;

public class Text05 {

    public static void main(String[] args) {
        String select="法力角色";
        Player P = new Player();
        FightAble F = P.select("法力角色");
        System.out.println("选择："+select);
        F.commonFight();
        F.specialFight();
        System.out.println("=================");
       String  select1="武力角色";
        FightAble F2 = P.select("武力角色");
        System.out.println("选择："+select1);
        F2.commonFight();
        F2.specialFight();
    }
}
