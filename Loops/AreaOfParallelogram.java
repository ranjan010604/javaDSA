package Loops;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Height should be the corresponding to its length of parallelogram");
        System.out.println("Length of the parallelogram: ");
        float b= sc.nextFloat();
        System.out.println("Height of Parallelogram: ");
        float h= sc.nextFloat();
        float area= b*h;
        System.out.println("area of parallelogram: "+area);
    }
}
