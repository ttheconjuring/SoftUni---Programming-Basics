package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int juniors = Integer.parseInt(sc.nextLine());
        int seniors = Integer.parseInt(sc.nextLine());
        String traceType = sc.nextLine();

        double totalPrice = 0.0;
        switch (traceType) {
            case "trail":
                totalPrice = juniors * 5.5 + seniors * 7;
                break;
            case "cross-country":
                if (juniors + seniors >= 50) {
                    totalPrice = juniors * 6 + seniors * 7.125;
                } else {
                    totalPrice = juniors * 8 + seniors * 9.5;
                }
                break;
            case "downhill":
                totalPrice = juniors * 12.25 + seniors * 13.75;
                break;
            case "road":
                totalPrice = juniors * 20 + seniors * 21.5;
                break;
            default:
                System.out.println("error");
        }

        totalPrice -= totalPrice * 0.05;

        System.out.printf("%.2f", totalPrice);

        sc.close();
    }
}
