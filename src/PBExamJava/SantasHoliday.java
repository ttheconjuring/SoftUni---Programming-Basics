package PBExamJava;

import java.util.Scanner;

public class SantasHoliday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int days = Integer.parseInt(sc.nextLine()) - 1;
        String roomType = sc.nextLine();
        String status = sc.nextLine();

        double price = 0;
        switch (roomType) {
            case "room for one person":
                price = days * 18;
                break;
            case "apartment":
                price = days * 25;
                if (days < 10) {
                    price = price - (price * 0.3);
                } else if (days < 15) {
                    price = price - (price * 0.35);
                } else {
                    price = price - (price * 0.5);
                }
                break;
            case "president apartment":
                price = days * 35;
                if (days < 10) {
                    price = price - (price * 0.1);
                } else if (days < 15) {
                    price = price - (price * 0.15);
                } else {
                    price = price - (price * 0.2);
                }
                break;
            default:
                System.out.println("error");
        }

        switch (status) {
            case "positive":
                price = price + (price * 0.25);
                break;
            case "negative":
                price = price - (price * 0.1);
                break;
            default:
                System.out.println("error");
        }

        System.out.printf("%.2f", price);

        sc.close();
    }
}
