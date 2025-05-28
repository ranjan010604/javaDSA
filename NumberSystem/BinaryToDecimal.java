package NumberSystem;
import java.util.Scanner;
public class BinaryToDecimal {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

        System.out.println("Enter a binary Number: ");
     int binary_num = sc.nextInt();
     int ans = 0;
     int power = 1;
     while (binary_num > 0 ) {
         int unit_number = binary_num %10;
         ans = ans + unit_number * power;
         binary_num /= 10;
         power *= 2;
     }
        System.out.println("The Decimal number of Binary Number"+ binary_num +"is"+ ans);
    }
}
