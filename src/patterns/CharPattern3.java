/*Enter no of rows:::4
D
C D
B C D
A B C D   */
package patterns;
import java.util.Scanner;
public class CharPattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows:::");
        int row=sc.nextInt();
        char ch=(char)('A'+row-1);
        for (int i = 1; i <= row ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (ch-i+j)+" ");
            }
            System.out.println();
        }
    }
}
