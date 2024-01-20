package array;

public class BinarySearch {
    static int search(int[] arr,int key){
        int start=0, end=arr.length-1;
        while (start <= end){
            int mid= start + (end-start)/2;
            System.out.println(mid);
            if(key == arr[mid]) {
                return mid;
            }
            else if(key < arr[mid] )
                end= mid-1;
            else
                start=mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int key=56;
        int index= search(arr,key);
        if(index != -1)
            System.out.println(key+" is present at index :: "+ index);
        else
            System.out.println(key +" not found");
    }
}
