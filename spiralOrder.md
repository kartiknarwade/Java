java
java
import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix==null || matrix.length==0) return result;
        int top = 0, bottom = matrix.length-1;
        int left = 0, right = matrix[0].length-1;
        while(left<=right && top<=bottom) {

            // Top row
            for(int i=left;i<=right;i++) result.add(matrix[top][i]);
            top++;
            
            // Right column
            for(int i=top;i<=bottom;i++) result.add(matrix[i][right]);
            right--;
            
            // Bottom row
            if(top<=bottom) {
                for(int i=right;i>=left;i--) result.add(matrix[bottom][i]);
                bottom--;
            }
            
            // Left column
            if(left<=right) {
                for(int i=bottom;i>=top;i--) result.add(matrix[i][left]);
                left++;
            }
        }
        return result;
    }
}


public class spiralOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Description of the code
        System.out.println("This program reads a matrix input from the user and returns the elements in spiral order.");
        System.out.println("Enter the number of test cases:");
        
        int t = scanner.nextInt(); // Number of test cases
        Solution solution = new Solution();

        for (int testCase = 1; testCase <= t; testCase++) {
            System.out.println("Test Case " + testCase + ":");

            System.out.println("Enter the number of rows and columns:");
            int rows = scanner.nextInt();
            int cols = scanner.nextInt();
            
            int[][] matrix = new int[rows][cols];
            System.out.println("Enter the matrix elements row by row:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }

            List<Integer> result = solution.spiralOrder(matrix);
            System.out.println("Spiral Order Output: " + result);
        }
        
        scanner.close();
    }
}


