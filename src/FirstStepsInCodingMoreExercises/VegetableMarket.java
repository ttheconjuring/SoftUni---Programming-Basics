package FirstStepsInCodingMoreExercises;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double priceOfOneKilogramOfVegetables = Double.parseDouble(sc.nextLine());
        double priceOfOneKilogramOfFruits = Double.parseDouble(sc.nextLine());
        int vegetablesKilograms = Integer.parseInt(sc.nextLine());
        int fruitsKilograms = Integer.parseInt(sc.nextLine());
        double vegetablesPrice = vegetablesKilograms * priceOfOneKilogramOfVegetables;
        double fruitsPrice = fruitsKilograms * priceOfOneKilogramOfFruits;
        double priceInBGN = vegetablesPrice + fruitsPrice;
        double priceInEuro = priceInBGN / 1.94;
        System.out.printf("%.2f", priceInEuro);
        sc.close();
    }
}
