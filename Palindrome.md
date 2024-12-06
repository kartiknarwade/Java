java
java
import java.util.Scanner;

class Solution {
    public boolean isPalindrome(int x) {
        if (0 > x)
            return false;
        int y = x;
        long rev = 0;
        while (y > 0) {
            rev = rev * 10 + y % 10;
            y /= 10;
        }
        return rev == x;
    }
}

public class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to check it is palindrome or not: ");
        int x = sc.nextInt();
        Solution ob = new Solution();
        boolean isPalindrome = ob.isPalindrome(x);
        if (isPalindrome) {
            System.out.println(x + " is a palindrome.");
        } else {
            System.out.println(x + " is not a palindrome.");
        }
        sc.close();
    }
}


