import java.util.Scanner;

public class SortColors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int length = sc.nextInt();

        int[] nums = new int[length];

        System.out.println("Enter the elements of the array (only 0, 1, or 2):");
        for (int i = 0; i < length; i++) {
            nums[i] = sc.nextInt();
        }

        sc.close();

        System.out.println("Before sorting: ");
        printArray(nums);

        Solution ans = new Solution();
        ans.sortColors(nums);

        System.out.println("After sorting: ");
        printArray(nums);
    }

    private static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
        
class Solution {
    public void sortColors(int[] nums) {
        int i = 0, j = nums.length, k = 0;
        while (k < j) {
            if (nums[k] == 0) swap(nums, i++, k++);
            else if (nums[k] == 2) swap(nums, --j, k);
            else ++k;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
