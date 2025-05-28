package Loops;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius of the Cone: ");
        int r= sc.nextInt();
        System.out.println("Enter height of the cone: ");
        int h = sc. nextInt();
        int l=(int) sqrt(r+h);
        int Area = 22/7*r*(l+r);
        int Perimeter= 22/7*r*l;
        System.out.println("Area of the cone= "+Area);
        System.out.println("Perimeter of the cone= "+Perimeter);
    }
}
