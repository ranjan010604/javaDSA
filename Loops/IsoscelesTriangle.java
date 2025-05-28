package Loops;

import java.util.Scanner;
import static java.lang.Math.sqrt;


public class IsoscelesTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter equal sides of triangle: ");
        int a= sc.nextInt();
        System.out.println("Enter different sides of triangle: ");
        int b= sc.nextInt();
        double area;
        area= b/4*sqrt(4*(a*a)-((b * b)));
        System.out.println("Area of Isosceles Triangle:" +area);
    }
}
