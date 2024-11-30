import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == arr2[i]) {
                    res.add(arr1[j]);
                    arr1[j] = -1;
                }
            }
        }
        Arrays.sort(arr1);
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != -1) res.add(arr1[i]);
        }
        int[] resultArray = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            resultArray[i] = res.get(i);
        }
        return resultArray;
    }
}

public class RelativeSortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in arr1: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the elements of arr1: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the number of elements in arr2: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter the elements of arr2: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        Solution solution = new Solution();
        int[] result = solution.relativeSortArray(arr1, arr2);

        System.out.println("Resultant array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        sc.close();
    }
}
