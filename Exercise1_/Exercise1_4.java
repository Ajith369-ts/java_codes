package Exercise1_;

import java.util.Scanner;

public class Exercise1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;

        int num, sum = 0, i = n;

        while (i > 0) {
            num = i % 10;
            sum += (num * num * num);

            if (n == sum) {
                result = 1;
            }

            i /= 10;
        }
        System.out.print(result);

        sc.close();
    }
}
