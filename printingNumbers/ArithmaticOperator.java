package printingNumbers;
import java.util.Scanner;
public class ArithmaticOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.println("Enter first Number: ");
        n1=sc.nextInt();
        System.out.println("Enter Second Number: ");
        n2=sc.nextInt();
        System.out.println(n1+n2);
        System.out.println(n1-n2);
        System.out.println(n1*n2);
        if (n2 == 0) {
            System.out.println("Division with zero is not possible");
            System.out.println("Enter a valid number");
        }
        else {
            System.out.println(n1/n2);
        }
    }
}
