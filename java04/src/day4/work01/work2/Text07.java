package day4.work01.work2;

public class Text07 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,3,2,1};
        int[] arr2={1,2,3,4,3,2,1};
        equals(arr1,arr2);
    }
    public static void equals( int[] arra,int[] arrb){
        boolean flag=true;
        for (int i = 0; i <arra.length ; i++) {
            if (arra[i]==arrb[i]){
                flag=true;
            }
        }
        if (flag){
            System.out.print("{");
            for (int j = 0; j <arra.length ; j++) {
                System.out.print(arra[j]+" ");
            }
            System.out.print("}");
            System.out.println(" ");
            System.out.print("{");
            for (int h = 0; h <arra.length ; h++) {
                System.out.print(+arra[h]+" ");
            }
            System.out.print("}");
            System.out.println("是一致的");
        }
    }
}
