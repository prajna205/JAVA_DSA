package array;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,4};
        int len=arr.length;
        int ans=0;
        //find the unique element
        for (int i = 0; i < len; i++) {
            ans=ans^arr[i];
            System.out.println("Duplicate number1::"+ans);
        }
        for (int i = 1; i < len; i++) {
            ans=ans^i;
            System.out.println("Duplicate number2::"+ans);
        }
        System.out.println("Duplicate number::"+ans);
    }
}
