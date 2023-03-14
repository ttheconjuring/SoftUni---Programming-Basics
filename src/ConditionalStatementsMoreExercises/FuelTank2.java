package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class FuelTank2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fuelType = sc.nextLine();
        double fuelQuantity = Double.parseDouble(sc.nextLine());
        String clubCard = sc.nextLine();

        double price = 0.0;
        if (fuelType.equals("Gas")) {
            if (clubCard.equals("Yes")) {
                double discount = fuelQuantity * 0.08;
                price = fuelQuantity * 0.93 - discount;
            } else {
                price = fuelQuantity * 0.93;
            }
            if (fuelQuantity >= 20 && fuelQuantity <= 25) {
                price -= price * 0.08;
            } else if (fuelQuantity > 25) {
                price -= price * 0.1;
            } else {
                price *= 1;
            }
        } else if (fuelType.equals("Gasoline")) {
            if (clubCard.equals("Yes")) {
                double discount = fuelQuantity * 0.18;
                price = fuelQuantity * 2.22 - discount;
            } else {
                price = fuelQuantity * 2.22;
            }
            if (fuelQuantity >= 20 && fuelQuantity <= 25) {
                price -= price * 0.08;
            } else if (fuelQuantity > 25) {
                price -= price * 0.1;
            } else {
                price *= 1;
            }
        } else if (fuelType.equals("Diesel")) {
            if (clubCard.equals("Yes")) {
                double discount = fuelQuantity * 0.12;
                price = fuelQuantity * 2.33 - discount;
            } else {
                price = fuelQuantity * 2.33;
            }
            if (fuelQuantity >= 20 && fuelQuantity <= 25) {
                price -= price * 0.08;
            } else if (fuelQuantity > 25) {
                price -= price * 0.1;
            } else {
                price *= 1;
            }
        } else {
            System.out.println("Invalid fuel!");
        }
        System.out.printf("%.2f lv.", price);
        sc.close();
    }
}
