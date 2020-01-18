package Text4;

import java.util.ArrayList;

public class Text04 {

    public static void main(String[] args) {
        APPLE A = new APPLE(5.0,"青色");
        APPLE A1 = new APPLE(3.0,"红色");
        ArrayList<APPLE> list = new ArrayList<>();
        list.add(A);
        list.add(A1);
        worker w = new worker(){
            @Override
            public void Compare() {
                System.out.println("默认挑大的");
                double min = list.get(0).getSize();
                for (int i = 0; i <list.size() ; i++) {
                    if (list.get(i).getSize()>=min){
                        System.out.println(list.get(i).getSize()+" "+ list.get(i).getColor());
                    }
                }
            }

            @Override
            public void ApplepickApple(String color) {
                System.out.println("挑"+color+"的");
                for (int i = 0; i <list.size() ; i++) {
                    if (list.get(i).getColor()==color){
                        System.out.println(list.get(i).getSize()+" "+ list.get(i).getColor());
                    }
                }
            }
        };
        w.Compare();
        w.ApplepickApple("红色");
    }
}
