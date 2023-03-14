package NestedLoopsMoreExercises;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int l = Integer.parseInt(sc.nextLine());

        String password = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= l; k++) {
                    for (int m = 1; m <= l; m++) {
                        for (int o = 1; o <= n; o++) {
                            if (o > i && o > j) {
                                password = String.valueOf(i) + String.valueOf(j) + String.valueOf(alphabet.charAt(k - 1)) + String.valueOf(alphabet.charAt(m - 1)) + String.valueOf(o);
                                System.out.printf("%s ", password);
                            }
                        }
                    }
                }
            }
        }

        sc.close();
    }
}
