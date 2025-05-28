package printingNumbers;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius of circle: ");
        double r= sc.nextDouble();
        double area = 22/7 * r * r;
        System.out.println("Area of circle= "+area);
    }
}
