package ForLoopMoreExercises;

import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double money = Double.parseDouble(sc.nextLine());
        int year = Integer.parseInt(sc.nextLine());

        double expenses;
        for (int i = 1800; i <= year; i++) {
            if(i % 2 == 0) {
                expenses = 12000;
                money -= expenses;
            } else {
                expenses = 12000 + 50 * ((i - 1800) + 18);
                money -= expenses;
            }
        }

        if(money >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", money);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(money));
        }

        sc.close();
    }
}
