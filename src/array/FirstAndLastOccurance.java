// First and Last Position of an Element In Sorted Array
package array;

public class FirstAndLastOccurance {
    public static void main(String[] args) {
        int[] arr={0 ,0,1, 1, 2, 2, 2, 2};
        int target =2;
        int[] result={-1,-1};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                if(result[0] == -1)
                    result[0] =i;
                result[1]=i;
            }
        }//for
        for(int x: result)
            System.out.print(x +" ");
    }
}
