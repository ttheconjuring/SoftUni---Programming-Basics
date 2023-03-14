package PBExamJava;

import java.util.Scanner;

public class Workout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int workoutDays = Integer.parseInt(sc.nextLine());
        double kmOnTheFirstDay = Double.parseDouble(sc.nextLine());
        int percentMore;

        double totalKm = kmOnTheFirstDay;
        double sum = kmOnTheFirstDay;
        for (int day = 1; day <= workoutDays ; day++) {
            percentMore = Integer.parseInt(sc.nextLine());
            totalKm = totalKm + (totalKm * percentMore / 100);
            sum += totalKm;
        }

        if(sum >= 1000) {
            System.out.printf("You've done a great job running %.0f more kilometers!", Math.ceil(sum - 1000));
        } else {
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", Math.ceil(1000 - sum));
        }

        sc.close();

    }
}
