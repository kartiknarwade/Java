java
java
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.isEmpty()) return ans;
        ans.add("");
        String[] d = new String[] {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        for (char i : digits.toCharArray()) {
            String s = d[i - '2'];
            List<String> t = new ArrayList<>();
            for (String a : ans) {
                for (String b : s.split("")) {
                    t.add(a + b);
                }
            }
            ans = t;
        }
        return ans;
    }
}

public class LetterCombinations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string of digits: ");
        String digits = sc.nextLine();

        Solution solution = new Solution();
        List<String> result = solution.letterCombinations(digits);

        System.out.println("Letter combinations: ");
        for (String combination : result) {
            System.out.print(combination + " ");
        }
        System.out.println();

        sc.close();
    }
}

