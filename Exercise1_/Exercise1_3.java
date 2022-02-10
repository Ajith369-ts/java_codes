package Exercise1_;

import java.util.Scanner;

public class Exercise1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 0;

        for (int j = 0; j < n; j++) {
            if (i % 2 == 0 && i % 3 == 0) {
                sum += i;
            }
            i += 2;
        }

        System.out.print(sum);

        sc.close();
    }
}
