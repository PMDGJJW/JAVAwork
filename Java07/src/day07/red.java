package day07;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class red {
    public static void main(String[] args) {
        Scanner price = new Scanner(System.in);
        System.out.println("请输入红包金额");
        int money = price.nextInt();
        Scanner i = new Scanner(System.in);
        System.out.println("请输入红包个数");
        int num = i.nextInt();
        ArrayList<Integer>list = new ArrayList<>();
        for (int x=0;x<num-1;x++){
           Random n =new Random();
           int rnum = n.nextInt((money/num)*2)+1;
           list.add(rnum);
           money -= rnum;
        }
        list.add(money);
        int all = 0;
        for (int j = 0; j <num ; j++) {
            System.out.println("每个人抢到的红包金额为"+ list.get(j));
            all +=list.get(j);
        }
        System.out.println("红包总金额为"+(all));
    }
}
