java
java
import java.util.Scanner;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        for (int i = 0; i < strs[0].length(); ++i) {
            for (int j = 1; j < n; ++j) {
                if (strs[j].length() <= i || strs[j].charAt(i) != strs[0].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();  // Consume the newline character

        String[] strs = new String[n];
        System.out.println("Enter the strings: ");
        for (int i = 0; i < n; ++i) {
            strs[i] = sc.nextLine();
        }

        Solution solution = new Solution();
        String result = solution.longestCommonPrefix(strs);

        System.out.println("Longest common prefix: " + result);

        sc.close();
    }
}

