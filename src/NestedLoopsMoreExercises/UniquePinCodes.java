package NestedLoopsMoreExercises;

import java.util.Scanner;

public class UniquePinCodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = Integer.parseInt(sc.nextLine());
        int second = Integer.parseInt(sc.nextLine());
        int third = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= first; i++) {
            for (int j = 1; j <= second; j++) {
                for (int k = 1; k <= third; k++) {
                    if ((i % 2 == 0 && k % 2 == 0) && (j == 2 || j == 3 || j == 5 || j == 7)) {
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }

        sc.close();
    }
}
