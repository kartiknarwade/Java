java
import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int moves = 0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for (int i = 0; i < seats.length; i++) {
            moves += Math.abs(seats[i] - students[i]);
        }
        return moves;
    }
}

public class MinimumNumberofMovesToSeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for seats array
        System.out.print("Enter the number of seats: ");
        int n = scanner.nextInt();
        int[] seats = new int[n];
        System.out.println("Enter the seats array elements:");
        for (int i = 0; i < n; i++) {
            seats[i] = scanner.nextInt();
        }

        // Taking input for students array
        int[] students = new int[n];
        System.out.println("Enter the students array elements ("+n+"):");
        for (int i = 0; i < n; i++) {
            students[i] = scanner.nextInt();
        }

        /*  Ensure the number of seats and students are equal  */

        // Create an instance of the Solution class
        Solution solution = new Solution();

        // Calling the method and printing the result
        int result = solution.minMovesToSeat(seats, students);
        System.out.println("Minimum moves to seat students: " + result);

        // Close the scanner
        scanner.close();
    }
}

