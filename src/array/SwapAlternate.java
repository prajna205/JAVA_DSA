package array;

public class SwapAlternate {
    static void swap(int[] arr,int len){
        int i=0,j=i+1;
        while(j<len){
           int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
           i=i+2;
           j=i+1;
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int len=arr.length;
        swap(arr,len);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
