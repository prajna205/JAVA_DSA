// First and Last Position of an Element In Sorted Array
//Bruteforce
package array;

public class FirstAndLastOccurance {
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
        int[] arr={0, 1, 2, 2, 2, 2};
        int key =1;
        int[] result={-1,-1};
        /*for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                if(result[0] == -1)
                    result[0] =i;
                result[1]=i;
            }
        }//for
        */
        result[0] =firstOccurance(arr,key);
        result[1] =lastOccurance(arr,key);
        for(int x: result)
            System.out.print(x +" ");
    }
}
