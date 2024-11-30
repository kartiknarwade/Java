import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {
    public int romanToInt(String s) {
        String RI = "IVXLCDM";
        int[] DI = {1, 5, 10, 50, 100, 500, 1000};
        Map<Character, Integer> m = new HashMap<>();
        for (int i = 0; i < DI.length; ++i) {
            m.put(RI.charAt(i), DI[i]);
        }
        int n = s.length();
        int res = m.get(s.charAt(n - 1));
        for (int i = 0; i < n - 1; ++i) {
            int sign = d.get(s.charAt(i)) < m.get(s.charAt(i + 1)) ? -1 : 1;
            res += sign * m.get(s.charAt(i));
        }
        return res;
    }
}

public class RomanToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Roman numeral: ");
        String roman = sc.nextLine();

        Solution solution = new Solution();
        int result = solution.romanToInt(roman);

        System.out.println("The integer value is: " + result);

        sc.close();
    }
}
