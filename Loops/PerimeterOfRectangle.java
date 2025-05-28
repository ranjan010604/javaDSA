package Loops;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter length of rectangle: ");
        int l= sc.nextInt();
        System.out.println("Enter Breath of the Rectangle:");
        int b= sc.nextInt();
        int Area= l*b;
        int Perimeter = 2*(l+b);
        System.out.println("Area of Rectangle= "+Area);
        System.out.println("Perimeter of Rectangle= "+Perimeter);
    }
}
