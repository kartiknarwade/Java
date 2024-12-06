java
import java.util.*;

class Solution{
    public int heightChecker(int[] heights) {
        int[] expected = heights.clone();
        Arrays.sort(expected);
        int res = 0;
        for (int i = 0; i < expected.length; i++) {
            if (expected[i] != heights[i]) {
                res++;
            }
        }
        return res;
    }
}

public class HightChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements in the heights array:");
        int n = sc.nextInt();
        int[] heightsArray = new int[n];
        
        System.out.println("Enter the elements of the heights array:");
        for (int i = 0; i < n; i++) {
            heightsArray[i] = sc.nextInt();
        }

        Solution solver = new Solution();
        
        int result = solver.heightChecker(heightsArray);
        
        System.out.println("Number of students in the wrong positions: " + result);
        sc.close();
    }
}

