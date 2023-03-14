package ForLoopMoreExercises;

import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        n = n * 2;
        int num;
        int sum = 0;
        int currentSum = 0;
        boolean flag = false;
        int diff = 0;
        int maxDiff = 0;

        if (n == 2) {
            num = Integer.parseInt(sc.nextLine());
            sum = sum + num;
            num = Integer.parseInt(sc.nextLine());
            sum = sum + num;
            System.out.println("Yes, value=" + sum);
        } else {
            for (int i = 1; i <= n; i++) {
                num = Integer.parseInt(sc.nextLine());
                sum = sum + num;
                if (currentSum == sum) {
                    flag = true;
                } else {
                    diff = Math.abs(currentSum - sum);
                    if(diff < maxDiff) {
                        maxDiff = diff;
                    }
                    flag = false;
                }
                if (i % 2 == 0) {
                    currentSum = sum;
                    sum = 0;
                }
            }

            if (flag) {
                System.out.println("Yes, value=" + currentSum);
            } else {
                System.out.println("No, maxdiff=" + diff);
            }
        }
        sc.close();
    }
}