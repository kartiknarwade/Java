java
java
import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    public boolean isValid(String s) {
        Deque<Character> stk = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stk.push(c);
            } else if (stk.isEmpty() || !match(stk.pop(), c)) {
                return false;
            }
        }
        return stk.isEmpty();
    }

    private boolean match(char l, char r) {
        return (l == '(' && r == ')' || l == '[' && r == ']' || l == '{' && r == '}');
    }
}

public class IsValid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string containing brackets: ");
        String input = sc.nextLine();

        Solution solution = new Solution();
        boolean result = solution.isValid(input);

        System.out.println("The string is " + (result ? "valid" : "invalid"));

        sc.close();
    }
}


