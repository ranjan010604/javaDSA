package Loops;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter length of rectangle: ");
        int l= sc.nextInt();
        System.out.println("Enter breath of Reactangle: ");
        int b= sc.nextInt();
        float area= l*b;
        System.out.println("Area of rectangle: " +area);

    }
}
