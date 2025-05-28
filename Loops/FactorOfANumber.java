package Loops;

import java.util.Scanner;

public class FactorOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= sc.nextInt();
        for (int i = 1; i < n; i++){  // run a loop from 1 to n
            if (n % i == 0){  //number which remainder is zero is a factor
                System.out.print(i +" ");  // print i which divides n completely
            }
        }
    }
}
