package NumberSystem;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Decimal Number: ");
        int decimal_num = sc.nextInt();

        int ans = 0;
        int power = 1;

        while (decimal_num > 0) {
            int parity = decimal_num % 2;     // Get the remainder (0 or 1)
            ans += parity * power;            // Construct binary number in reverse
            power *= 10;                      // Move to next digit (10, 100, etc.)
            decimal_num /= 2;                 // Divide by 2 to get next bit
        }

        System.out.println("Binary equivalent: " + ans);
    }
}

