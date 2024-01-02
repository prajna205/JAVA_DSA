package array;

public class linearSearch {
    static int search(int[] arr, int len,int ele){
        int index=-1;
        for (int i = 0; i < len; i++) {
            if (arr[i] == ele)
                index=i;
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr={10,45,3,87,4,0,1};
        int len=arr.length;
        int ele=14;
        //weather 1 is present or not
        int res=search(arr,len,ele);
        if (res>=0)
            System.out.println("Element is present at index::"+res);
        else
            System.out.println("Element is not present ");


    }
}
