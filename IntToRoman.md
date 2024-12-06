java
java
import java.util.Scanner;
import java.util.List;

class Solution {
    public String intToRoman(int num) {
        List<String> RI = List.of("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I");
        List<Integer> DI = List.of(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1);
        StringBuilder ans = new StringBuilder();
        for (int i = 0, n = RI.size(); i < n; ++i) {
            while (num >= DI.get(i)) {
                num -= DI.get(i);
                ans.append(RI.get(i));
            }
        }
        return ans.toString();
    }
}

public class IntToRoman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        Solution solution = new Solution();
        String result = solution.intToRoman(num);

        System.out.println("Roman numeral: " + result);

        sc.close();
    }
}


