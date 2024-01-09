/*
4
      1
    1 2 1
  1 2 3 2 1
1 2 3 4 3 2 1
 * */
package patterns;
import java.util.Scanner;
public class NumberPattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows::");
        int row=sc.nextInt();
        for (int i = 1; i <= row ; i++) {
            //print space
            for (int j = 1; j <= row-i+1; j++) {
                System.out.print(j+" ");
            }
            for (int j = 1; j <= 2*i-2; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= row-i+1; j++) {
                System.out.print((row-i-j+2)+" ");
            }
            System.out.println();
        }
    }
}
