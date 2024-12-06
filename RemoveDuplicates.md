java
java
import java.util.Scanner;

class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int x : nums) {
            if (k == 0 || x != nums[k - 1]) {
                nums[k++] = x;
            }
        }
        return k;
    }
}

public class RemoveDuplicates{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        
        int[] nums = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; ++i) {
            nums[i] = sc.nextInt();
        }

        Solution solution = new Solution();
        int newSize = solution.removeDuplicates(nums);

        System.out.println("New size after removing duplicates: " + newSize);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newSize; ++i) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}


