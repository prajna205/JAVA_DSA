package patterns;

import java.util.Scanner;

public class pattren1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows:::");
        int row=sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
