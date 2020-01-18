package day4.work01.work2;

public class Text10 {
    public static void main(String[] args) {
        int [] arr={99,100,98,96,97};
        int max=arr[0];
        int min=arr[0];
        int pscore=0;
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            if ( max<arr[i] ){
                max=arr[i];
            }
            if ( min>arr[i] ){
                min=arr[i];
            }
            sum+=arr[i];
            pscore=(sum-max-min)/(arr.length-2);

        }
        System.out.println("最终得分："+pscore);
    }
}
