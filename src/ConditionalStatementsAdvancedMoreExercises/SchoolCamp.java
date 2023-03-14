package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String season = sc.nextLine();
        String groupType = sc.nextLine();
        int students = Integer.parseInt(sc.nextLine());
        int days = Integer.parseInt(sc.nextLine());

        double totalPrice = 0.0;
        String sport = "";
        switch (season) {
            case "Winter":
                switch (groupType) {
                    case "boys":
                        totalPrice = days * 9.6 * students;
                        sport = "Judo";
                        break;
                    case "girls":
                        totalPrice = days * 9.6 * students;
                        sport = "Gymnastics";
                        break;
                    case "mixed":
                        totalPrice = days * 10 * students;
                        sport = "Ski";
                        break;
                    default:
                        System.out.println("error");
                }
                break;
            case "Spring":
                switch (groupType) {
                    case "boys":
                        totalPrice = days * 7.2 * students;
                        sport = "Tennis";
                        break;
                    case "girls":
                        totalPrice = days * 7.2 * students;
                        sport = "Athletics";
                        break;
                    case "mixed":
                        totalPrice = days * 9.5 * students;
                        sport = "Cycling";
                        break;
                    default:
                        System.out.println("error");
                }
                break;
            case "Summer":
                switch (groupType) {
                    case "boys":
                        totalPrice = days * 15 * students;
                        sport = "Football";
                        break;
                    case "girls":
                        totalPrice = days * 15 * students;
                        sport = "Volleyball";
                        break;
                    case "mixed":
                        totalPrice = days * 20 * students;
                        sport = "Swimming";
                        break;
                    default:
                        System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
        }

        if (students >= 50) {
            totalPrice -= totalPrice * 0.5;
        } else if(students >= 20){
            totalPrice -= totalPrice * 0.15;
        } else if (students >= 10) {
            totalPrice -= totalPrice * 0.05;
        }

        System.out.printf("%s %.2f lv.", sport, totalPrice);

        sc.close();
    }
}
