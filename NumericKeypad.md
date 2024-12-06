java
java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution{
    public List<String> Keypad(String digits){
        List<String> ans = new ArrayList<>();
        if(digits.isEmpty()) return ans;
        ans.add("");
        String[] d = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        for (char i : digits.toCharArray()) {
            String s = d[i-'2'];
            List<String> t = new ArrayList<>();
            for (String a : ans) {
                for (String b : s.split("")) {
                    t.add(a+b);
                }
            }
            ans=t;
        }
        return ans;
    }
}

public class NumericKeypad{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to get all possibilities of word to be printed: ");
        String digit = sc.next();
        Solution solution = new Solution();
        List<String> s = solution.Keypad(digit);
        System.out.println("Possibilities are: " + s);
        sc.close();
    }
}


