package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = Integer.parseInt(sc.nextLine());
        String roomType = sc.nextLine();
        String comment = sc.nextLine();

        int nights = days - 1;
        double price = 0.0;

        switch (roomType) {
            case "room for one person":
                price = nights * 18;
                break;
            case "apartment":
                price = nights * 25;
                if (nights < 10) {
                    price -= price * 0.3;
                } else if (nights <= 15) {
                    price -= price * 0.35;
                } else {
                    price -= price * 0.5;
                }
                break;
            case "president apartment":
                price = nights * 35;
                if (nights < 10) {
                    price -= price * 0.1;
                } else if (nights <= 15) {
                    price -= price * 0.15;
                } else {
                    price -= price * 0.2;
                }
                break;
            default:
                System.out.println("error");
        }

        if(comment.equals("positive")){
            price += price * 0.25;
        } else {
            price -= price * 0.1;
        }

        System.out.printf("%.2f", price);

        sc.close();
    }
}
