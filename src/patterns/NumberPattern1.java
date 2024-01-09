/*
1
2 1
3 2 1
4 3 2 1 */
package patterns;
public class NumberPattern1 {
    public static void main(String[] args) {
        int row=4;
        for (int i = 1; i <= row ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i-j+1 +" ");
            }
            System.out.println();
        }
    }
}
