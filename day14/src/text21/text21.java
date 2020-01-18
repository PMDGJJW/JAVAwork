package text21;

import java.util.Scanner;

public class text21 {

    public static void main(String[] args) {
        DebitCard card = new DebitCard();
        card.setMoney(500);
        card.setAccountNumber("admin");
        System.out.println("账户名： "+card.getAccountNumber()+" "+"余额： "+card.getMoney());
        System.out.println("输入取走的余额");
        Scanner i = new Scanner(System.in);
        int price = i.nextInt();
        int umoney = card.getMoney();
        umoney-=price;
        card.setMoney(umoney);
        System.out.println("账户名： "+card.getAccountNumber()+" "+"余额： "+card.getMoney());
    }
}
