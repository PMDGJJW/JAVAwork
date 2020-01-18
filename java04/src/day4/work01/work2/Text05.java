package day4.work01.work2;

public class Text05 {
    public static void main(String[] args) {
        int [] arrscore={95,92,75,56,98,71,80,58,91,91};
        getAvg(arrscore);
    }
    public static void getAvg(int[] arr) {
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
        }
        int sunP=sum/arr.length;
        int Pnum=0;
        for (int j = 0; j <arr.length ; j++) {
            if (arr[j]>sunP){
                Pnum++;
            }
        }
        System.out.println("高于平均分"+sunP+"的个数有"+Pnum+"个");
    }
}
