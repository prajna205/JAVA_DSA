/*Enter no of rows:::5
A
B C
C D E
D E F G
E F G H I  */
package patterns;
import java.util.Scanner;
public class CharPattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows:::");
        int row=sc.nextInt();
        for (int i = 1; i <= row ; i++) {
            char ch='A';
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (ch+j+i-2)+" ");
            }
            System.out.println();
        }
    }
}
