package Loops;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary;
        System.out.println("Enter salary of the person");
        salary=sc.nextInt();
        if (salary >= 20000) {
            salary = salary+2000;
            System.out.println("Hurray! you got a bonus of 2000 and you current salary is:"+salary);
        } else if (salary > 10000 && salary < 20000) {
            salary= salary + 1000;
            System.out.println("You got bonus of 1000");
            System.out.println(salary);
        }
        else {
            System.out.println("you haven't got any bonus");
        }


        }
    }

