package day06.day6H;

import java.util.ArrayList;

public class TextH {
    public static void main(String[] args) {
        Worker W=new Worker();
        ArrayList<Worker>newList=new ArrayList<>();
        ArrayList<Worker>list=new ArrayList<>();
        list.add(new Worker("曹20操",15000));
        list.add(new Worker("吕19布",45230));
        list.add(new Worker("刘18备",31034));
        list.add(new Worker("刘17备",23400));
        list.add(new Worker("曹1+操",54800));
        list.add(new Worker("吕15布",16500));
        list.add(new Worker("刘14备",49500));
        list.add(new Worker("刘13备",75200));
        list.add(new Worker("曹12操",23600));
        list.add(new Worker("吕11布",45000));
        list.add(new Worker("刘10备",31000));
        list.add(new Worker("刘9备",41000));
        list.add(new Worker("曹8操",45000));
        list.add(new Worker("吕7布",15400));
        list.add(new Worker("刘6备",31400));
        list.add(new Worker("刘5备",41050));
        list.add(new Worker("曹4操",85300));
        list.add(new Worker("吕3布",45000));
        list.add(new Worker("刘2备",31000));
        list.add(new Worker("刘1备",41400));
        list.add(new Worker("曹20操",15000));
        list.add(new Worker("吕19布",45230));
        list.add(new Worker("刘18备",3034));
        list.add(new Worker("刘17备",23400));
        list.add(new Worker("曹1+操",54800));
        list.add(new Worker("吕15布",16500));
        list.add(new Worker("刘14备",4500));
        list.add(new Worker("刘13备",200));
        list.add(new Worker("曹12操",23600));
        list.add(new Worker("吕11布",45000));
        list.add(new Worker("刘10备",1000));
        list.add(new Worker("刘9备",6000));
        list.add(new Worker("曹8操",45000));
        list.add(new Worker("吕7布",15000));
        list.add(new Worker("刘6备",64000));
        list.add(new Worker("刘5备",41000));
        list.add(new Worker("曹4操",85310));
        list.add(new Worker("吕3布",45340));
        list.add(new Worker("刘2备",31300));
        list.add(new Worker("刘1备",21000));
        double pnum=0;
        double max=list.get(0).getPrice();
        double min=list.get(0).getPrice();
        int g=0;
        int r=0;
        int t=0;
        for (int x =0;x<list.size();x++){
            g+=1;
            Worker N=list.get(x);
            System.out.println(N.getName()+N.getPrice());
            pnum+=N.getPrice();
            max=max>list.get(x).getPrice()? max:list.get(x).getPrice();
            min=min<list.get(x).getPrice()? min:list.get(x).getPrice();


        }
        System.out.println("max"+max);
        System.out.println("min"+min);
        for (int y=0;y<list.size();y++){
            double sum= (pnum-max-min)/(list.size()-2);
            if (list.get(y).getPrice()>=sum){
                newList.add(list.get(y));
            }
            g+=1;
        }
        for (int l=0;l<newList.size();l++){
           for (int o=0;o<l;o++){
               g+=1;
               if (newList.get(l).getPrice()>newList.get(o).getPrice()){
                   Worker N = newList.get(o);
                   newList.set(o,newList.get(l));
                   newList.set(l,N);
               }
           }
        }
        for (int p=0;p<3;p++){
            System.out.println(newList.get(p).getName()+"，"+newList.get(p).getPrice());
            g+=1;
        }
        System.out.println("数据个数："+list.size()+"个");
        System.out.println("循环次数："+g+"次");
    }

}
