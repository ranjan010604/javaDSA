package Loops;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius of the circle: ");
        int r = in.nextInt();
        float area;
        area= (float) (2 * 22 * r * r) /7;
        System.out.println(area);
    }
}
