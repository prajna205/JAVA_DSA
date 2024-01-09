/*Given an integer array nums of length n where all the
integers of nums are in the range [1, n] and each integer appears once or
twice, return an array of all the integers that appears twice.
You must write an algorithm that runs in O(n) time and uses only constant extra space.
Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]
*/
package array;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
    static List<Integer> FindDuplicates(int[] arr){
        List<Integer> li=new ArrayList<>();
        for(int x:arr){
            int index=Math.abs(x);
            if(arr[index-1] > 0)
                arr[index-1] *= -1;
            else
                li.add(index);
        }
        return li;
    }
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        List<Integer> li= FindDuplicates(arr);
        System.out.println(li);
    }
}
