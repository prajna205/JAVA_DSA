package Basicmath;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n=5;
        int num1=0;int num2=1;
        System.out.print(num1 +" ,"+num2);
        for (int i = 0; i < n; i++) {
            int sum=num1+num2;
            System.out.print(" ,"+sum);
            num1=num2;
            num2=sum;
        }
    }
}
