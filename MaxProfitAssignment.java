import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        Arrays.sort(worker);
        int n = profit.length;
        int[][] jobs = new int[n][2];
        for (int i = 0; i < n; ++i) {
            jobs[i] = new int[] {difficulty[i], profit[i]};
        }
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);
        int ans = 0, mx = 0, i = 0;
        for (int w : worker) {
            while (i < n && jobs[i][0] <= w) {
                mx = Math.max(mx, jobs[i++][1]);
            }
            ans += mx;
        }
        return ans;
    }
}

public class MaxProfitAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of jobs: ");
        int n = sc.nextInt();

        System.out.print("Enter the number of workers: ");
        int m = sc.nextInt();

        int[] difficulty = new int[n];
        int[] profit = new int[n];
        int[] worker = new int[m];

        System.out.println("Enter the difficulties of the jobs: ");
        for (int i = 0; i < n; ++i) {
            difficulty[i] = sc.nextInt();
        }

        System.out.println("Enter the profits of the jobs: ");
        for (int i = 0; i < n; ++i) {
            profit[i] = sc.nextInt();
        }

        System.out.println("Enter the capabilities of the workers: ");
        for (int i = 0; i < m; ++i) {
            worker[i] = sc.nextInt();
        }

        Solution solution = new Solution();
        int result = solution.maxProfitAssignment(difficulty, profit, worker);
        System.out.println("Maximum profit that can be achieved: " + result);

        sc.close();
    }
}