package printingNumbers;

import java.util.Scanner;

public class IncrementDecrementOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println(n);
        n++;
        System.out.println(n);
        n--;
        System.out.println(n);
        ++n;
        System.out.println(n);
        --n;
        System.out.println(n);
    }
}
