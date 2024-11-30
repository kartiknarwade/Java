import java.util.Scanner;

class Solution {
    public int reverse(int x) {
        int res = 0;
        for (; x != 0; x /= 10) {
            if (res < Integer.MIN_VALUE / 10 || res > Integer.MAX_VALUE / 10) {
                return 0;
            }
            res = res * 10 + x % 10;
        }
        return res;
    }
}

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int x = scanner.nextInt();

        Solution solution = new Solution();
        int result = solution.reverse(x);

        System.out.println("Reversed integer: " + result);

        scanner.close();
    }
}
