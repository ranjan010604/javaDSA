package Loops;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b, c;
        System.out.println("Enter first side of triangle: ");
        a= sc.nextFloat();
        System.out.println("Enter first side of triangle: ");
        b= sc.nextFloat();
        System.out.println("Enter first side of triangle: ");
        c= sc.nextFloat();
        float s;
        double area;
        s=(a+b+c)/2;
        area= sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of Triangle is: " +area);

    }
}
