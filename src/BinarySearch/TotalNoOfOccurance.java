package BinarySearch;
public class TotalNoOfOccurance {
    public static int firstOccurance(int[] arr, int key){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while (start <= end){
            int mid=start + (end- start)/2;
            if(key == arr[mid]){
                ans=mid;
                end=mid-1;
            }
            else if(key < arr[mid]){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return ans;
    } public static int lastOccurance(int[] arr, int key){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while (start <= end){
            int mid=start + (end- start)/2;
            if(key == arr[mid]){
                ans=mid;
                start=mid+1;
            }
            else if(key < arr[mid]){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={0, 1, 2, 2, 2, 2, 7};
        int key=2;
        int first =firstOccurance(arr,key);
        System.out.println(first);
        int last =lastOccurance(arr,key);
        System.out.println(last);
        System.out.print("Total no of occuraces:: "+ (last - first +1));
    }
}
