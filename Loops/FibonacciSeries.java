package Loops;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numbers of terms up to which series display: ");
        int n= sc.nextInt();
        int f=0, g=1;
        for (int i = 0; i < n-1; i++) {
            System.out.println(g);
            int l=f+g;
            f=g;
            g=l;
        }
    }
}
