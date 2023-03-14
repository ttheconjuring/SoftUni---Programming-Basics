package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        String ticketCategory = sc.nextLine();
        int people = Integer.parseInt(sc.nextLine());

        if (people >= 1 && people <= 4) {
            budget -= budget * 0.75;
        } else if (people >= 5 && people <= 9) {
            budget -= budget * 0.6;
        } else if (people >= 10 && people <= 24) {
            budget -= budget * 0.5;
        } else if (people >= 25 && people <= 49) {
            budget -= budget * 0.4;
        } else {
            budget -= budget * 0.25;
        }

        double ticketPrice = 0.0;
        switch (ticketCategory) {
            case "VIP":
                ticketPrice = 499.99;
                break;
            case "Normal":
                ticketPrice = 249.99;
                break;
            default:
                System.out.println("error");
        }

        double totalTicketPrice = people * ticketPrice;

        if (budget >= totalTicketPrice) {
            System.out.printf("Yes! You have %.2f leva left.", budget - totalTicketPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", (totalTicketPrice - budget));
        }

        sc.close();
    }
}
