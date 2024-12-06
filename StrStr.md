java
import java.util.Scanner;

class Solution {
    public int strStr(String haystack, String needle) {
        int idx = haystack.indexOf(needle);
        return idx;
    }
}

public class StrStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter haystack string: ");
        String haystack = sc.nextLine();

        System.out.print("Enter needle string: ");
        String needle = sc.nextLine();

        Solution solution = new Solution();
        int result = solution.strStr(haystack, needle);

        System.out.println("Index: " + result);

        sc.close();
    }
}

