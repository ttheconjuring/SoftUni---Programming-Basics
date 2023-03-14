package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        String season = sc.nextLine();

        if (budget <= 1000) {
            switch (season) {
                case "Summer":
                    budget *= 0.65;
                    System.out.printf("Alaska - Camp - %.2f", budget);
                    break;
                case "Winter":
                    budget *= 0.45;
                    System.out.printf("Morocco - Camp - %.2f", budget);
                    break;
                default:
                    System.out.println("error");
            }
        } else if (budget > 1000 && budget <= 3000) {
            switch (season) {
                case "Summer":
                    budget *= 0.8;
                    System.out.printf("Alaska - Hut - %.2f", budget);
                    break;
                case "Winter":
                    budget *= 0.6;
                    System.out.printf("Morocco - Hut - %.2f", budget);
                    break;
                default:
                    System.out.println("error");
            }
        } else {
            switch (season) {
                case "Summer":
                    budget *= 0.9;
                    System.out.printf("Alaska - Hotel - %.2f", budget);
                    break;
                case "Winter":
                    budget *= 0.9;
                    System.out.printf("Morocco - Hotel - %.2f", budget);
                    break;
                default:
                    System.out.println("error");
            }
        }

        sc.close();
    }
}
