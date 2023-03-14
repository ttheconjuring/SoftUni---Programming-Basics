package ForLoopLab;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int oddSum = 0;
        int evenSum = 0;
        int number;
        for (int i = 0; i < n; i++) {
            number = Integer.parseInt(sc.nextLine());
            if (i % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }
        if(oddSum == evenSum){
            System.out.println("Yes");
            System.out.println("Sum = " + oddSum);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(oddSum - evenSum));
        }
        sc.close();
    }
}
