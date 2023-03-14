package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String season = sc.nextLine();
        double kmPerMonth = Double.parseDouble(sc.nextLine());

        double income = 0.0;

        if (kmPerMonth <= 5000) {
            switch (season) {
                case "Spring":
                case "Autumn":
                    income = kmPerMonth * 0.75 * 4;
                    break;
                case "Summer":
                    income = kmPerMonth * 0.9 * 4;
                    break;
                case "Winter":
                    income = kmPerMonth * 1.05 * 4;
                    break;
                default:
                    System.out.println("error");
            }
        } else if (kmPerMonth > 5000 && kmPerMonth <= 10000) {
            switch (season) {
                case "Spring":
                case "Autumn":
                    income = kmPerMonth * 0.95 * 4;
                    break;
                case "Summer":
                    income = kmPerMonth * 1.1 * 4;
                    break;
                case "Winter":
                    income = kmPerMonth * 1.25 * 4;
                    break;
                default:
                    System.out.println("error");
            }
        } else if (kmPerMonth > 10000 && kmPerMonth <= 20000) {
            income = kmPerMonth * 1.45 * 4;
        }

        income -= income * 0.1;

        System.out.printf("%.2f", income);

        sc.close();
    }
}
