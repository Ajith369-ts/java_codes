package Exercise1_;

import java.util.Scanner;

public class Exercise1_5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double mark_avg;
        int result;
        int i;
        int s;
        // define size of array
        s = input.nextInt();
        // The array is defined "arr" and inserted marks into it.
        int[] arr = new int[s];
        int sum = 0;

        try {
            for (i = 0; i < arr.length; i++) {
                arr[i] = input.nextInt();
            }
        } finally {
            input.close();
        }
        // Initialize maximum element as first element of the array.
        // Traverse array elements to get the current max.
        // Store the highest mark in the variable result.
        // Store average mark in avgMarks.

        result = arr[0];

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > result) {
                result = arr[j];
            }

            sum += arr[j];
        }

        mark_avg = (double) sum / (double) arr.length;

        System.out.println(result);
        System.out.print(mark_avg);
    }
}
