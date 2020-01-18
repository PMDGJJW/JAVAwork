package text10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Text10 {

    public static  void fa(ArrayList<String> paiku){
        Collections.shuffle(paiku);
//        for (String str : paiku){
//            System.out.println(str);
//        }
        ArrayList<String> play1 = new ArrayList<>();
        ArrayList<String> play2 = new ArrayList<>();
        ArrayList<String> play3 = new ArrayList<>();
        ArrayList<String> DP = new ArrayList<>();
        for (int i = 0; i <paiku.size() ; i++) {
            if (i<paiku.size()-3){
                if (i%3==0){
                    play1.add(paiku.get(i));
                }
                else if (i%3==1){
                    play2.add(paiku.get(i));
                }
                else {
                    play3.add(paiku.get(i));
                }
            }
            else {
                DP.add(paiku.get(i));
            }
        }
        for (int i = 0; i <DP.size() ; i++) {
            if (DP.get(i).equals("大王")){
               fa(paiku);
            }
        }
        System.out.println("PALY1:"+play1);
        System.out.println("PLAY2："+play2);
        System.out.println("PLAY3："+play3);
        System.out.println("底 牌："+DP);
        System.out.println("选牌了地主牌后：");
        for (int i = 0; i <17 ; i++) {
            if (play1.get(i).equals("大王")){
                play1.addAll(play1.size(),DP);

            }
            else if (play2.get(i).equals("大王")){
                play2.addAll(play2.size(),DP);

            }
            else if (play3.get(i).equals("大王")){
                play3.addAll(play3.size(),DP);

            }
        }

        System.out.println("PALY1:"+play1);
        System.out.println("PLAY2："+play2);
        System.out.println("PLAY3："+play3);
    }
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        ArrayList<String> card = new ArrayList<>();
        color.add("♠");
        color.add("♥");
        color.add("♣");
        color.add("♦");
        for (int i = 2; i <=10 ; i++) {
            card.add(String.valueOf(i));
        }
        card.add("A");
        card.add("J");
        card.add("Q");
        card.add("K");
        ArrayList<String> paiku = new ArrayList<>();
        for (int i = 0; i <color.size() ; i++) {
            for (int j = 0; j <card.size() ; j++) {
                paiku.add(color.get(i)+card.get(j));
            }
        }
        paiku.add("大王");
        paiku.add("小王");
        fa(paiku);
        System.out.println("----------------------------------------");

    }
}
