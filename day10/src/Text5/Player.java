package Text5;

public class Player {
    public  FightAble select(String type){
        if("法力角色".equals(type)){
            return  new fa();
        }
        else if ("武力角色".equals(type)){
        return new zhan();
        }
        return null;
    }
}
