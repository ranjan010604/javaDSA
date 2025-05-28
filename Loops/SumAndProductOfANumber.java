package Loops;

import java.util.Scanner;

public class SumAndProductOfANumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Digit: ");
        int n= sc.nextInt();
        int product=1, sum=0;
        while(n>0) {
            int digit = n % 10;
            product *= digit;
            sum += digit;
            n /= 10;
        }
        int result= product-sum;
        System.out.println(result);
    }
}
