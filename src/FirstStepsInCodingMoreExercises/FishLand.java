package FirstStepsInCodingMoreExercises;

import java.util.Scanner;

public class FishLand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mackerelPricePerKilogram = Double.parseDouble(sc.nextLine());
        double sprinklePricePerKilogram = Double.parseDouble(sc.nextLine());
        double kilogramsOfBonito = Double.parseDouble(sc.nextLine());
        double kilogramsOfScad = Double.parseDouble(sc.nextLine());
        double kilogramsOfMussels = Double.parseDouble(sc.nextLine());

        double bonitoPricePerKilogram = mackerelPricePerKilogram + (mackerelPricePerKilogram * 0.6);
        double scadPricePerKilogram = sprinklePricePerKilogram + (sprinklePricePerKilogram * 0.8);
        double musselsPricePerKilogram = 7.5;

        double bonitoPrice = kilogramsOfBonito * bonitoPricePerKilogram;
        double scadPrice = kilogramsOfScad * scadPricePerKilogram;
        double musselsPrice = kilogramsOfMussels * musselsPricePerKilogram;

        double sum = bonitoPrice + scadPrice + musselsPrice;
        System.out.printf("%.2f", sum);
        sc.close();
    }
}
