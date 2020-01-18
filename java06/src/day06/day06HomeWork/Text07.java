package day06.day06W;

import java.util.ArrayList;
import java.util.Scanner;

public class Text07 {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<>();
        Scanner S1 = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入第" + (i + 1) + "本书的名称：");
            String title = S1.next();
            System.out.println("请输入第" + (i + 1) + "本书的ISBN编码：");
            String isbn = S1.next();
            System.out.println("请输入第" + (i + 1) + "本书的价格：");
            double price = S1.nextDouble();
            Book B = new Book(title, isbn, price);
            list.add(B);

        }
        double max = list.get(0).getPrice();
        for (int j = 0; j < list.size(); j++) {
            Book b = list.get(j);
            System.out.println(b.getTitle() + "," + b.getIsbn() + "," + b.getPrice());
        }
        int num = 0;
        for (int y = 0; y < list.size(); y++) {
            if (list.get(y).getPrice() > max) {
                max = list.get(y).getPrice();
                num = y;
            }
        }
        System.out.println("最贵的书是：" + list.get(num).getTitle() + " , " + list.get(num).getIsbn() + " , " + list.get(num).getPrice());
      for (int x=0;x<list.size();x++){
          for (int y=0;y<x;y++){
              if (list.get(x).getPrice()>list.get(y).getPrice()){
                  Book M = list.get(y);
                  list.set(y,list.get(x));
                  list.set(x,M);
              }
          }
      }
      for (int l=0;l<list.size();l++){
          System.out.println( list.get(l).getTitle() + " , " + list.get(l).getIsbn() + " , " + list.get(l).getPrice());
      }
    }
}
