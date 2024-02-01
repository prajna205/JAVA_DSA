package BinarySearch;

import java.util.Scanner;

public class PerfectSqrt {
    public static long sqrtN(long N) {
        long low=0;
        long high=N;
        long ans=1;
        while(low<=high){
            long mid=low + (high-low)/2;
            long square=mid * mid;
            if( square <= N){
                ans=mid;
                low=mid+1;
            }
            else
                high=mid-1;
        }
        return ans;
    }
    public static double sqrtWithpricission(long num , int pricission, long tempans){
        double factor=1;
        double ans=tempans;
        for(int i=0;i<pricission;i++){
            factor= factor/10;
            for (double j=ans; j*j < num; j=j+factor){
                ans=j;
            }
        }
        return Math.round(ans * 1000.0) / 1000.0;
    }
    public static void main(String[] args) {
        System.out.println("Enter number::");
        Scanner sc=new Scanner(System.in);
        long num=sc.nextLong();
        long tempAns=sqrtN(num);
        System.out.println(sqrtWithpricission(num,3,tempAns));
    }
}
