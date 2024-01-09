/*
* 4
 *
 * *
 * * *
 * * * *
* */
package patterns;
import java.util.Scanner;
public class StarPattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        for (int i = 1; i <= row ; i++) {
            //print space
            for (int j = 1; j <= row; j++) {
                if (j<= row-i)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
