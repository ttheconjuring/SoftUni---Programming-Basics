package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fuelType = sc.nextLine();
        double liters = Double.parseDouble(sc.nextLine());
        if (fuelType.equals("Diesel")) {
            if (liters >= 25) {
                System.out.printf("You have enough %s.", fuelType.toLowerCase());
            } else {
                System.out.printf("Fill your tank with %s!", fuelType.toLowerCase());
            }
        } else if (fuelType.equals("Gasoline")) {
            if (liters >= 25) {
                System.out.printf("You have enough %s.", fuelType.toLowerCase());
            } else {
                System.out.printf("Fill your tank with %s!", fuelType.toLowerCase());
            }
        } else if (fuelType.equals("Gas")) {
            if (liters >= 25) {
                System.out.printf("You have enough %s.", fuelType.toLowerCase());
            } else {
                System.out.printf("Fill your tank with %s!", fuelType.toLowerCase());
            }
        } else {
            System.out.println("Invalid fuel!");
        }
        sc.close();
    }
}
