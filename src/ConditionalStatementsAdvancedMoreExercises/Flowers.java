package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chrysanthemums = Integer.parseInt(sc.nextLine());
        int roses = Integer.parseInt(sc.nextLine());
        int tulips = Integer.parseInt(sc.nextLine());
        String season = sc.nextLine();
        String isItHoliday = sc.nextLine();

        double totalPrice = 0.0;
        switch (isItHoliday) {
            case "Y":
                switch (season) {
                    case "Spring":
                        totalPrice = (chrysanthemums * 2) + (roses * 4.1) + (tulips * 2.5);
                        totalPrice += totalPrice * 0.15;
                        if (tulips > 7) {
                            totalPrice -= totalPrice * 0.05;
                        }
                        if (chrysanthemums + roses + tulips > 20) {
                            totalPrice -= totalPrice * 0.2;
                        }
                        break;
                    case "Summer":
                        totalPrice = (chrysanthemums * 2) + (roses * 4.1) + (tulips * 2.5);
                        totalPrice += totalPrice * 0.15;
                        if (chrysanthemums + roses + tulips > 20) {
                            totalPrice -= totalPrice * 0.2;
                        }
                        break;
                    case "Autumn":
                        totalPrice = (chrysanthemums * 3.75) + (roses * 4.5) + (tulips * 4.15);
                        totalPrice += totalPrice * 0.15;
                        if (chrysanthemums + roses + tulips > 20) {
                            totalPrice -= totalPrice * 0.2;
                        }
                        break;
                    case "Winter":
                        totalPrice = (chrysanthemums * 3.75) + (roses * 4.5) + (tulips * 4.15);
                        totalPrice += totalPrice * 0.15;
                        if (roses >= 10) {
                            totalPrice -= totalPrice * 0.1;
                        }
                        if (chrysanthemums + roses + tulips > 20) {
                            totalPrice -= totalPrice * 0.2;
                        }
                        break;
                    default:
                        System.out.println("error");
                }
                break;
            case "N":
                switch (season) {
                    case "Spring":
                        totalPrice = (chrysanthemums * 2) + (roses * 4.1) + (tulips * 2.5);
                        if (tulips > 7) {
                            totalPrice -= totalPrice * 0.05;
                        }
                        if (chrysanthemums + roses + tulips > 20) {
                            totalPrice -= totalPrice * 0.2;
                        }
                        break;
                    case "Summer":
                        totalPrice = (chrysanthemums * 2) + (roses * 4.1) + (tulips * 2.5);
                        if (chrysanthemums + roses + tulips > 20) {
                            totalPrice -= totalPrice * 0.2;
                        }
                        break;
                    case "Autumn":
                        totalPrice = (chrysanthemums * 3.75) + (roses * 4.5) + (tulips * 4.15);
                        if (chrysanthemums + roses + tulips > 20) {
                            totalPrice -= totalPrice * 0.2;
                        }
                        break;
                    case "Winter":
                        totalPrice = (chrysanthemums * 3.75) + (roses * 4.5) + (tulips * 4.15);
                        if (roses >= 10) {
                            totalPrice -= totalPrice * 0.1;
                        }
                        if (chrysanthemums + roses + tulips > 20) {
                            totalPrice -= totalPrice * 0.2;
                        }
                        break;
                    default:
                        System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
        }

        System.out.printf("%.2f", totalPrice + 2);

        sc.close();
    }
}
