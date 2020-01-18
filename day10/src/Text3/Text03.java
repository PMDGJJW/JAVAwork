package Text3;

import java.util.ArrayList;

public class Text03 {

    public static void main(String[] args) {
        ArrayList<User>list= new ArrayList<>();
        User U = new User();
        System.out.println("未分组：");
        for (int i = 0; i <50 ; i++) {
            list.add(new User());
        }
        for (int i = 0; i <50 ; i++) {
            list.get(i).setId(i+1);
            System.out.print(list.get(i).getId()+" - "+list.get(i).getUserType()+"  ");
        }

        System.out.println("已分组：");
        Userjie J = new Userjie(){
            @Override
            public void ﬁlterUser() {
                for (int i = 0; i <list.size() ; i++) {
                    list.get(i).setUserType("A");
                }
            }
        };
        J.ﬁlterUser();
        Userjie J1 = new Userjie(){
            public void ﬁlterUser() {
                for (int i = 10; i <19 ; i++) {
                    list.get(i).setUserType("V1");
                }
            }
        };
        Userjie J2 = new Userjie(){
            public void ﬁlterUser() {
                for (int i = 19; i <29 ; i++) {
                    list.get(i).setUserType("V2");
                }
            }
        };
        J1.ﬁlterUser();
        J2.ﬁlterUser();
        for (int i = 0; i <list.size() ; i++) {
            if (i%9==0){
                System.out.println(" ");
            }
            System.out.print(list.get(i).getId()+"- "+list.get(i).getUserType()+"  ");
        }
    }
}
