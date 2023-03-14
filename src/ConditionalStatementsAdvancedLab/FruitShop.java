package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.nextLine();
        String day = sc.nextLine();
        double quantity = Double.parseDouble(sc.nextLine());
        switch (fruit) {
            case "banana":
                switch (day) {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        System.out.printf("%.2f", quantity * 2.5);
                        break;
                    case "Saturday":
                    case "Sunday":
                        System.out.printf("%.2f", quantity * 2.7);
                        break;
                    default:
                        System.out.println("error");
                }
                break;
            case "apple":
                switch (day) {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        System.out.printf("%.2f", quantity * 1.2);
                        break;
                    case "Saturday":
                    case "Sunday":
                        System.out.printf("%.2f", quantity * 1.25);
                        break;
                    default:
                        System.out.println("error");
                }
                break;
            case "orange":
                switch (day) {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        System.out.printf("%.2f", quantity * 0.85);
                        break;
                    case "Saturday":
                    case "Sunday":
                        System.out.printf("%.2f", quantity * 0.9);
                        break;
                    default:
                        System.out.println("error");
                }
                break;
            case "grapefruit":
                switch (day) {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        System.out.printf("%.2f", quantity * 1.45);
                        break;
                    case "Saturday":
                    case "Sunday":
                        System.out.printf("%.2f", quantity * 1.6);
                        break;
                    default:
                        System.out.println("error");
                }
                break;
            case "kiwi":
                switch (day) {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        System.out.printf("%.2f", quantity * 2.7);
                        break;
                    case "Saturday":
                    case "Sunday":
                        System.out.printf("%.2f", quantity * 3);
                        break;
                    default:
                        System.out.println("error");
                }
                break;
            case "pineapple":
                switch (day) {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        System.out.printf("%.2f", quantity * 5.5);
                        break;
                    case "Saturday":
                    case "Sunday":
                        System.out.printf("%.2f", quantity * 5.6);
                        break;
                    default:
                        System.out.println("error");
                }
                break;
            case "grapes":
                switch (day) {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        System.out.printf("%.2f", quantity * 3.85);
                        break;
                    case "Saturday":
                    case "Sunday":
                        System.out.printf("%.2f", quantity * 4.2);
                        break;
                    default:
                        System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
        }
        sc.close();
    }
}
