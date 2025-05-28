package Loops;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the previous Reading of Meter: ");
        int pre=sc.nextInt();
        System.out.println("Enter the New Reading of the Meter: ");
        int now= sc.nextInt();
        float Consumption= now - pre;
          Consumption= Consumption/1000; // to convert into unit
        System.out.println("Enter Rate of the Electricity in per KWh");
        int rate= sc.nextInt();
        float Bill= Consumption*rate;
        System.out.println("Electricity Bill= "+Bill);
    }
}
