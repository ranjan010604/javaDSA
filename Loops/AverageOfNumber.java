package Loops;

import java.util.Scanner;

public class AverageOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find average: ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            int result = n * (n + 1) / 2;
            System.out.println("Average of the number = "+result);
        }
        else {
            int result= n*(n+1)*(n+2)/6;
            System.out.println(result);
        }
        }
    }

