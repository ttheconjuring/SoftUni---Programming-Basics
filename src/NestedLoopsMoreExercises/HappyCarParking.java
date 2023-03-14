package NestedLoopsMoreExercises;

import java.util.Scanner;

public class HappyCarParking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = Integer.parseInt(sc.nextLine());
        int hours = Integer.parseInt(sc.nextLine());

        double parkingCost;
        double dayExpenses = 0;
        double totalExpenses = 0;

        for (int day = 1; day <= days; day++) {
            for (int hour = 1; hour <= hours; hour++) {
                if(day % 2 == 0) {
                    if(hour % 2 != 0) {
                        parkingCost = 2.5;
                        dayExpenses = dayExpenses + parkingCost;
                    } else {
                        parkingCost = 1;
                        dayExpenses = dayExpenses + parkingCost;
                    }
                } else {
                    if(hour % 2 == 0) {
                        parkingCost = 1.25;
                        dayExpenses = dayExpenses + parkingCost;
                    } else {
                        parkingCost = 1;
                        dayExpenses = dayExpenses + parkingCost;
                    }
                }
            }
            System.out.printf("Day: %d - %.2f leva%n", day, dayExpenses);
            totalExpenses = totalExpenses + dayExpenses;
            dayExpenses = 0;
        }

        System.out.printf("Total: %.2f leva%n", totalExpenses);

        sc.close();
    }
}
