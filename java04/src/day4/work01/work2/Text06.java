package day4.work01.work2;

public class Text06 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,8,2,1};
        boolean flag=true;
        for (int i = 0; i <arr.length/2 ; i++) {
            if (arr[i]==arr[arr.length-1-i]){
                flag=true;
            }
        }
        if (flag){
            System.out.print("{1,2,3,4,8,2,1}是对称数组");
        }
    }
}
