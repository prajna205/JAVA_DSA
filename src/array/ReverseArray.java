package array;

public class ReverseArray {
    static void reverse(int[] arr,int len){
        int i=0,j=len-1;
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
    }
    public static void main(String[] args) {
        int[] arr={12,34,56,23,4,98,85,7};
        int len=arr.length;
        reverse(arr,len);
        for(int i:arr)
            System.out.print(i+" ");
    }
}
