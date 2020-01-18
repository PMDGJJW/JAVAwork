package day4.work01.work2;

public class Text03 {
    public static void main(String[] args) {
        int[]nums={5,10,15};
        int[]newArr={0,0,0};
        System.out.println("nums旧数组为：");
        for (int i = 0; i <nums.length ; i++) {
           newArr[i]=nums[i]*2;
            System.out.print(nums[i]+","+"");
        }
        System.out.println();
        System.out.println("newArr新数组为：");
        for (int j = 0; j <newArr.length ; j++) {
            System.out.print(newArr[j]+","+"");
        }
    }
}
