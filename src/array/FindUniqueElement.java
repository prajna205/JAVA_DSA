/*You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
You need to find and return that number which is unique in the array/list.*/

/* solution
* if we'll do xor 2 same number it ll give 0 .as every
* element is present twice they ll cancel out each other and only the unique element ll be left.
* */
package array;

import java.util.HashMap;
import java.util.Map;

public class FindUniqueElement {
    public static void main(String[] args) {
        int[] arr={1 ,3 ,1 ,3 ,6 ,6 ,7,34,7};
        /* Best approach
        int result=0;
        int len=arr.length;
        for(int i:arr){
            result=result^i;
        }
        System.out.println("Unique element is::"+result);
        */
        Map<Integer,Integer> hmap=new HashMap<>();
        //save the count in a hashmap
        for(int i: arr){
            hmap.put(i,hmap.getOrDefault(i,0)+1);
        }
        //if count ==1 the unique
        for(int x: hmap.keySet()){
            if(hmap.get(x)==1){
                System.out.println("Unique element is::"+ x);
            }
        }
    }
}
