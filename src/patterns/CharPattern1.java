/*Enter no of rows:::
3
A B C
B C D
C D E */
package patterns;
import java.util.Scanner;

public class CharPattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows:::");
        int row=sc.nextInt();
        for (int i = 1; i <= row ; i++) {
            char ch='A';
            for (int j = 1; j <= row; j++) {
                System.out.print((char) (ch+j+i-2)+" ");
            }
            System.out.println();
        }
    }
}
