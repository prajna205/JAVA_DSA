package array;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        List<Integer> li=new ArrayList<>();
        for(int num: arr){
            int index= Math.abs(num);
            if (arr[index-1]>0)
                arr[index-1] *= -1;
            else
                li.add(index);
        }
        for (int x:li)
            System.out.print(x +" ");
    }
}
