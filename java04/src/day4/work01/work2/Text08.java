package day4.work01.work2;

public class Text08 {
    public static void main(String[] args) {
        String[] arrm = {"D", "C", "B", "A", "D"};
        String[] arrh = {"A", "D", "B", "C", "D"};
        String[] arrH = {"A", "D", "B", "C", "A"};
        String[] arrq = {"A", "B", "C", "D", "D"};
        String[] arr = {"A", "D", "B", "C", "D"};
        int scorem = 0;
        int scoreh = 0;
        int scoreH = 0;
        int scoreq = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arrm[i]==arr[i]){
                scorem+=2;
            }
            if (arrh[i]==arr[i]){
                scoreh+=2;
            }
            if (arrH[i]==arr[i]){
                scoreH+=2;
            }
            if (arrq[i]==arr[i]){
                scoreq+=2;
            }
        }
        System.out.println("满分10分"+"小明:得分："+scorem+"分");
        System.out.println("满分10分"+"小红:得分："+scoreh+"分");
        System.out.println("满分10分"+"小黄:得分："+scoreH+"分");
        System.out.println("满分10分"+"小强:得分："+scoreq+"分");
    }
}
