package ForLoopMoreExercises;

import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        double oddSum = 0;
        double oddMin = 10000000;
        double oddMax = -10000000;
        double evenSum = 0;
        double evenMin = 10000000;
        double evenMax = -10000000;
        double num;

        for (int i = 1; i <= n; i++) {
            num = Double.parseDouble(sc.nextLine());
            if (i % 2 == 0) {
                evenSum = evenSum + num;
                if (num < evenMin) {
                    evenMin = num;
                }
                if (num > evenMax) {
                    evenMax = num;
                }
            } else {
                oddSum = oddSum + num;
                if (num < oddMin) {
                    oddMin = num;
                }
                if (num > oddMax) {
                    oddMax = num;
                }
            }
        }

        System.out.printf("OddSum=%.2f,%n", oddSum);
        if (oddMin == 10000000) {
            System.out.println("OddMin=No,");
        } else {
            System.out.printf("OddMin=%.2f,%n", oddMin);
        }
        if (oddMax == -10000000) {
            System.out.println("OddMax=No,");
        } else {
            System.out.printf("OddMax=%.2f,%n", oddMax);
        }
        System.out.printf("EvenSum=%.2f,%n", evenSum);
        if (evenMin == 10000000) {
            System.out.println("EvenMin=No,");
        } else {
            System.out.printf("EvenMin=%.2f,%n", evenMin);
        }
        if (evenMax == -10000000) {
            System.out.println("EvenMax=No");
        } else {
            System.out.printf("EvenMax=%.2f%n", evenMax);
        }

        sc.close();
    }


}

