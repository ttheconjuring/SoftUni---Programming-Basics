package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        String season = sc.nextLine();

        if (budget <= 100) {
            System.out.println("Economy class");
            switch (season) {
                case "Summer":
                    System.out.printf("Cabrio - %.2f", budget * 0.35);
                    break;
                case "Winter":
                    System.out.printf("Jeep - %.2f", budget * 0.65);
                    break;
                default:
                    System.out.println("error");
            }
        } else if (budget > 100 && budget <= 500) {
            System.out.println("Compact class");
            switch (season) {
                case "Summer":
                    System.out.printf("Cabrio - %.2f", budget * 0.45);
                    break;
                case "Winter":
                    System.out.printf("Jeep - %.2f", budget * 0.8);
                    break;
                default:
                    System.out.println("error");
            }
        } else {
            System.out.println("Luxury class");
            System.out.printf("Jeep - %.2f", budget * 0.9);
        }
        sc.close();
    }
}
