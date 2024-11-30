import java.util.Scanner;

class Solution {

    String compareFrac(String str) {
        String[] fraction = str.split(", ");
        String[] fraction1 = fraction[0].split("/");
        String[] fraction2 = fraction[1].split("/");
        
        float num1 = Integer.parseInt(fraction1[0]);
        float den1 = Integer.parseInt(fraction1[1]);
        float num2 = Integer.parseInt(fraction2[0]);
        float den2 = Integer.parseInt(fraction2[1]);
        
        float ans1 = num1 / den1;
        float ans2 = num2 / den2;
        
        if (ans1 == ans2) return "equal";
        else if (ans1 > ans2) return fraction[0];
        else return fraction[1];
    }
}

public class CompareFrac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two fractions separated by a comma (e.g., 1/2, 3/4):");
        String input = sc.nextLine();

        Solution solution = new Solution();
        String result = solution.compareFrac(input);

        System.out.println("The result is: " + result);

        sc.close();
    }
}