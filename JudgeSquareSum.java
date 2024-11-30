import java.util.Scanner;

class Solution {
    public boolean judgeSquareSum(int c) {
        long i = 0, k = (long)Math.sqrt(c);
        while (i <= k) {
            if ((i * i) + (k * k) == c)
                return true;
            else if ((i * i) + (k * k) > c)
                --k;
            else
                ++i;
        }
        return false;
    }
}

public class JudgeSquareSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter an integer to check weather it can be expressed\nas the sum of squares of two integers or not: ");
        int c = sc.nextInt();

        Solution solution = new Solution();
        boolean result = solution.judgeSquareSum(c);

        if (result) {
            System.out.println("\n" + c + " can be expressed as the sum of squares of two integers.\n");
        } else {
            System.out.println("\n" + c + " cannot be expressed as the sum of squares of two integers.\n");
        }

        sc.close();
    }
}
