java
import java.util.Scanner;

class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; --i) {
            ++digits[i];
            digits[i] %= 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        digits = new int[n + 1];
        digits[0] = 1;
        return digits;
    }
}

public class PlusOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of digits: ");
        int n = sc.nextInt();
        int[] digits = new int[n];

        System.out.println("Enter the digits:");
        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }

        Solution solution = new Solution();
        int[] result = solution.plusOne(digits);

        System.out.println("Result after adding one:");
        for (int digit : result) {
            System.out.print(digit + " ");
        }

        sc.close();
    }
}
