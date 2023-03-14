package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        String season = sc.nextLine();
        if(budget <= 100){
            switch (season){
                case "summer":
                    System.out.println("Somewhere is Bulgaria");
                    System.out.printf("Camp - %.2f", budget * 0.3);
                    break;
                case "winter":
                    System.out.println("Somewhere is Bulgaria");
                    System.out.printf("Hotel - %.2f", budget * 0.7);
                    break;
                default:
                    System.out.println("error");
            }
        } else if(budget <= 1000){
            switch (season){
                case "summer":
                    System.out.println("Somewhere is Balkans");
                    System.out.printf("Camp - %.2f", budget * 0.4);
                    break;
                case "winter":
                    System.out.println("Somewhere is Balkans");
                    System.out.printf("Hotel - %.2f", budget * 0.8);
                    break;
                default:
                    System.out.println("error");
            }
        } else {
            System.out.println("Somewhere is Europe");
            System.out.printf("Hotel - %.2f", budget * 0.9);
        }

        sc.close();
    }
}
