import java.util.Scanner;

class ThreeConsecutiveOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Solution solution = new Solution();
        boolean result = solution.threeConsecutiveOdds(arr);

        System.out.println(result ? "There are three consecutive odd numbers in the array." : "There are no three consecutive odd numbers in the array.");
        
        sc.close();
    }
}

class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        if (arr.length < 3) return false;
        for (int i = 0; i < arr.length - 2; i++) {
            if ((arr[i] & 1) == 1 && (arr[i + 1] & 1) == 1 && (arr[i + 2] & 1) == 1) {
                return true;
            }
        }
        return false;
    }
}