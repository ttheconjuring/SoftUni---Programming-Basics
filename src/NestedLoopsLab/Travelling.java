package NestedLoopsLab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String destination = sc.nextLine();
        double minBudget;
        double currentBudget = 0;
        double budget;
        while (!destination.equals("End")) {
            minBudget = Double.parseDouble(sc.nextLine());
            while (currentBudget < minBudget) {
                budget = Double.parseDouble(sc.nextLine());
                currentBudget += budget;
            }
            System.out.printf("Going to %s!%n", destination);
            currentBudget = 0;
            destination = sc.nextLine();
        }
        sc.close();
    }
}
