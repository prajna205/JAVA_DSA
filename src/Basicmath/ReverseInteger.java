
/*
Given a signed 32-bit integer x, return x with its digits
reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
* */
package Basicmath;

import java.util.Scanner;

public class ReverseInteger {
    static  int Reverse(int num){
        int ans=0;
        while(num != 0){
            int digit=num%10;
            if (ans < Integer.MIN_VALUE/10 || ans > Integer.MAX_VALUE/10) {
                return 0;
            }
            ans=(ans*10)+digit;
            num=num/10;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(Reverse(num));
    }
}
