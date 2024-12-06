java
java
import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int minIncrementForUnique(int[] nums) {
        int moves = 0;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i-1]) {
                int incr = nums[i-1] - nums[i] + 1;
                nums[i] += incr;
                moves += incr;
            }
        }
        return moves;
    }
}

public class MinIncrementForUnique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Solution solution = new Solution();
        int result = solution.minIncrementForUnique(nums);

        System.out.println("Minimum increments to make array elements unique: " + result);
        scanner.close();
    }
}


