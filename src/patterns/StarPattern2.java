/*
 * 4
 * * * *
 * * *
 * *
 *
 * */
package patterns;
import java.util.Scanner;
public class StarPattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        for (int i = 1; i <= row ; i++) {
            //print space
            for (int j = 1; j <= row-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
