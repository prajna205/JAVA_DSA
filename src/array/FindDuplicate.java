package array;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4};
        int len=arr.length;
        int ans=0;
        for (int i = 0; i < len; i++) {
            ans=ans^arr[i];
        }
        for (int i = 1; i < len; i++) {
            ans=ans^i;
        }
        System.out.println("Duplicate number::"+ans);
    }
}
