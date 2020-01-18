package Text7;

import java.util.ArrayList;

public class GouWuChe {

    ArrayList<Goods>list = new ArrayList<>();
    public void addGoods(Goods goods){
        System.out.println("加入"+"    " +goods.getName()+"       成功");
        list.add(goods);
    }
    public  void  showgoods(){
        for (int i = 0; i <list.size() ; i++) {
            System.out.println( list.get(i).getId()+"   "+list.get(i).getName()+"     "+list.get(i).getPrice()+"    元");
        }
    }
    public void  jiesuan(){
        double yuan = 0;
        double zhe = 0;
        for (int i = 0; i <list.size() ; i++) {
            yuan +=list.get(i).getPrice();
        }
        zhe = (yuan*0.88);
        System.out.println("原价为：  " +yuan+"  元" );
        System.out.println("打折后价为：  " +zhe +"  元");
    }
}
