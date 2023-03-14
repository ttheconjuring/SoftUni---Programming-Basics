package NestedLoopsMoreExercises;

import java.util.Scanner;

public class SecretDoorsLocm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hundreds = Integer.parseInt(sc.nextLine());
        int tens = Integer.parseInt(sc.nextLine());
        int ones = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= hundreds; i++) {
            if(i % 2 == 0) {
                for (int j = 1; j <= tens; j++) {
                    if(j == 2 || j == 3 || j == 5 || j == 7) {
                        for (int k = 1; k <= ones; k++) {
                            if(k % 2 == 0) {
                                System.out.printf("%d %d %d %n", i, j, k);
                            }
                        }
                    }
                }
            }
        }

        sc.close();
    }
}
