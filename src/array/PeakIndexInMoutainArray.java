//leetcode- 852
package array;

public class PeakIndexInMoutainArray {
    public static void main(String[] args) {
        int[] arr={0,10,5,2};
        int beg=0;
        int end=arr.length-1;
        int peak =-1;
        while(beg <= end){
            int mid= beg +(end-beg)/2;
            if (mid==0)
                peak=mid+1;
            else if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1])
                   peak=mid;
            else if (arr[mid] < arr[mid+1] )
                    beg=mid+1;
            else
                end=mid-1;
        }
        System.out.println(peak);
    }
}
