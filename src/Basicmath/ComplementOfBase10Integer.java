/*
* The complement of an integer is the integer you get when you flip all the 0's to 1's and all the 1's to 0's in its binary representation.
    For example, The integer 5 is "101" in binary and its complement is "010" which is the integer 2.
Given an integer n, return its complement.*/
package Basicmath;

import java.util.Scanner;

public class ComplementOfBase10Integer {
    static  int Complement(int num){
        int ans=0;
        int power=1;
        if(num==0)
            ans=1;
        while(num != 0){
            int bit=num&1;
            if(bit==0){
                ans=ans+power;
            }
            power=power*2;
            num=num>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(Complement(num));
    }
}
