package Text6;

import java.util.ArrayList;
import java.util.Scanner;

public class text06 {
    public static void main(String[] args) {
        /*添加商品信息*/
        shop s1 = new shop("001","少林核桃",15.5,"斤");
        shop s2 = new shop("002","尚康饼干",14.5,"包");
        shop s3 = new shop("003","移动硬盘",345.0,"个");
        shop s4 = new shop("004","高清无码",199.0,"G");
        ArrayList<shop>list= new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        System.out.println("                   欢迎使用超市购物系统");
        System.out.println("请输入你要进行的操作：");
        System.out.println(" 1:购买商品"+"      2: 结算并打印小票"+"          3: 退出系统");
        Scanner i =new Scanner(System.in);
        int num = i.nextInt();
        System.out.println("--------------------------------------------");
        if (num==1){
            System.out.println("            商品列表");
            System.out.println("商品id  "+ "     名称"+  "      单价"+ "    计价单位");
            list.forEach(n->{
                System.out.print(n.getId()+"        "+n.getName()+"   "+n.getPrice()+"     "+n.getPp());
                System.out.println(" ");
            });
        }
        System.out.println("-----------------------------------------");
        System.out.println("请输入您要购买的商品选项（输入格式：商品id号-购买数量），输入end表示购买结束。");

        String Idnum = "";
        for (int j = 0; j <list.size() ; j++) {
            Idnum+=list.get(j).getId();
        }
        String [] goods =new String[]{};
        ArrayList<String> userlist = new ArrayList<>();
        ArrayList<String> usernum = new ArrayList<>();
        ArrayList<String> userid= new ArrayList<>();
        while (true){
            Scanner q = new Scanner(System.in);
            String shopnum = q.nextLine();
                userlist.add(shopnum);
            if (shopnum.length()<5||shopnum.indexOf("-")==-1){
                System.out.println("您输入的姿势不对，请换个姿势再来,格式：（商品id号-购买数量）");
            }
            if (userlist.get(userlist.size()-1).equals("end")){
                System.out.println("购买结束");
                userlist.remove(userlist.size()-1);
                break;
            }
        }

        System.out.println("请输入你的操作"+" 1:购买商品"+"      2: 结算并打印小票"+"          3: 退出系统");
        System.out.println("---------------------------------------------");
        Scanner num2 = new Scanner(System.in);
        int i2 =num2.nextInt();
        int lastnum = 0;
        double lastprice =0;
        if (i2==2){
            for (int j = 0; j <userlist.size() ; j++) {
                goods  = userlist.get(j).split("-");
                usernum.add(goods[1]);
                userid.add(goods[0]);
            }
            System.out.println("    欢迎光临");
            System.out.println("  名称  "+" 售价 "+" 数量"+" 金额");
            for (int j = 0; j <list.size() ; j++) {
                for (int k = 0; k <userlist.size() ; k++) {
                    if (list.get(j).getId().equals(String.valueOf(userid.get(k)))) {
                        int a = Integer.parseInt(usernum.get(k));
                        lastnum+=a;
                        double goodsprice = (list.get(j).getPrice()*a);
                        lastprice+=goodsprice;
                        System.out.println(list.get(j).getName() + "  " + list.get(j).getPrice() + "  " + (usernum.get(k))+" "+ goodsprice);
                    }
                }
            }
            System.out.println(usernum.size()+"件商品");
            System.out.println("共计："+lastnum+"件");
            System.out.println("共："+lastprice+"元");
        }
        System.out.println("-----------------------");
        System.out.println("请输入你的操作"+" 1:购买商品"+"      2: 结算并打印小票"+"          3: 退出系统");
        Scanner num3 = new Scanner(System.in);
        int i3 =num3.nextInt();
        if (i3==3){
            return;

        }

    }
}
