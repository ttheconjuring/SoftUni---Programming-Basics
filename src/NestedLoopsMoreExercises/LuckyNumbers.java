package NestedLoopsMoreExercises;

import java.util.Scanner;

public class LuckyNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        String combo = "";

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    for (int l = 1; l <= n; l++) {
                        if(!(i + j == k + l)) {
                           continue;
                        }
                        if(!(n % (i + j) == 0)) {
                            continue;
                        }
                        combo = i + "" + j + "" + k + "" + l;
                        if(combo.length() == 4) {
                            System.out.print(combo + " ");
                        } else {
                            break;
                        }
                    }
                }
            }
        }

        sc.close();
    }
}
