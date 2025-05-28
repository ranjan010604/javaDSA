package printingNumbers;

import java.util.Scanner;

public class SumTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = sc.nextInt();
        System.out.println("Enter second number: ");
        int y = sc.nextInt();
        double sum = x+y;
        System.out.println("Sum = "+sum);
    }
}
