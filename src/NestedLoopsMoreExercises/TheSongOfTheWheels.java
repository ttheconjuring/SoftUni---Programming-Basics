package NestedLoopsMoreExercises;

import java.util.Scanner;

public class TheSongOfTheWheels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int controlValue = Integer.parseInt(sc.nextLine());

        String fourthPassword = "";
        int passwordCounter = 0;
        boolean validCombination = false;
        boolean fourthPassFound = false;

        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    for (int d = 1; d <= 9; d++) {
                        if ((a < b) && (c > d)) {
                            if (a * b + c * d == controlValue) {
                                validCombination = true;
                                passwordCounter++;
                                System.out.printf("%d%d%d%d ", a, b, c, d);
                                if (passwordCounter == 4) {
                                    fourthPassFound = true;
                                    fourthPassword = a + "" + b + "" + c + "" + d;
                                }
                            }
                        }
                    }
                }
            }
        }
        if(fourthPassFound) {
            System.out.println();
            System.out.println("Password: " + fourthPassword);
        } else {
            if(validCombination) {
                System.out.println();
                System.out.println("No!");
            } else {
                System.out.println("No!");
            }
        }
        sc.close();
    }
}
