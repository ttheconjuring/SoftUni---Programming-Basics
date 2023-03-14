package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int budget = Integer.parseInt(sc.nextLine());
        String season = sc.nextLine();
        int fishers = Integer.parseInt(sc.nextLine());

        double rent = 0.0;
        double discount = 0.0;
        double bonusDiscount = 0.0;
        switch (season) {
            case "Spring":
                rent = 3000;
                if (fishers <= 6) {
                    discount = rent * 0.1;
                    rent -= discount;
                } else if (fishers <= 11) {
                    discount = rent * 0.15;
                    rent -= discount;
                } else {
                    discount = rent * 0.25;
                    rent -= discount;
                }
                if (fishers % 2 == 0) {
                    bonusDiscount = rent * 0.05;
                    rent -= bonusDiscount;
                }
                break;
            case "Summer":
                rent = 4200;
                if (fishers <= 6) {
                    discount = rent * 0.1;
                    rent -= discount;
                } else if (fishers <= 11) {
                    discount = rent * 0.15;
                    rent -= discount;
                } else {
                    discount = rent * 0.25;
                    rent -= discount;
                }
                if (fishers % 2 == 0) {
                    bonusDiscount = rent * 0.05;
                    rent -= bonusDiscount;
                }
                break;
            case "Autumn":
                rent = 4200;
                if (fishers <= 6) {
                    discount = rent * 0.1;
                    rent -= discount;
                } else if (fishers <= 11) {
                    discount = rent * 0.15;
                    rent -= discount;
                } else {
                    discount = rent * 0.25;
                    rent -= discount;
                }
                break;
            case "Winter":
                rent = 2600;
                if (fishers <= 6) {
                    discount = rent * 0.1;
                    rent -= discount;
                } else if (fishers <= 11) {
                    discount = rent * 0.15;
                    rent -= discount;
                } else {
                    discount = rent * 0.25;
                    rent -= discount;
                }
                if (fishers % 2 == 0) {
                    bonusDiscount = rent * 0.05;
                    rent -= bonusDiscount;
                }
                break;
            default:
                System.out.println("error");
        }

        if(budget >= rent){
            System.out.printf("Yes! You have %.2f leva left.", budget - rent);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", rent - budget);
        }

        sc.close();
    }
}
