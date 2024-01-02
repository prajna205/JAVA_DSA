package array;

import java.util.Scanner;

public class Min_Max {
    static int getMax(int[] arr,int len){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            if (arr[i]> max)
                max=arr[i];
        }
        return max;
    }
    static int getMin(int[] arr,int len){
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < len; i++) {
            if (arr[i] < min)
                min=arr[i];
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr={10,42,-34,65,76,98,-23,100};
        int len=arr.length;
        System.out.println("Max::"+ getMax(arr,len));
        System.out.println("Min::"+ getMin(arr,len));
    }
}
