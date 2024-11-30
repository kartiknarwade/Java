import java.util.Scanner;

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int x : nums) {
            if (x != val) {
                nums[k++] = x;
            }
        }
        return k;
    }
}

public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; ++i) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter the value to remove: ");
        int val = sc.nextInt();

        Solution solution = new Solution();
        int newLength = solution.removeElement(nums, val);

        System.out.println("New array length: " + newLength);
        System.out.println("Modified array: ");
        for (int i = 0; i < newLength; ++i) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}