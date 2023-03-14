package NestedLoopsMoreExercises;

import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oneLvCoins = Integer.parseInt(sc.nextLine());
        int twoLvCoins = Integer.parseInt(sc.nextLine());
        int fiveLvBanknotes = Integer.parseInt(sc.nextLine());
        int sum = Integer.parseInt(sc.nextLine());

        for (int i = 0; i <= oneLvCoins; i++) {
            for (int j = 0; j <= twoLvCoins; j++) {
                for (int k = 0; k <= fiveLvBanknotes; k++) {
                    if(i + (j * 2) + (k * 5) == sum) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n", i, j, k, sum);
                    }
                }
            }
        }

        sc.close();
    }
}
