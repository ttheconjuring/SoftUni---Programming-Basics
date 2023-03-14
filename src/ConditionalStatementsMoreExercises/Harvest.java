package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = Integer.parseInt(sc.nextLine());
        double Y = Double.parseDouble(sc.nextLine());
        int Z = Integer.parseInt(sc.nextLine());
        int workers = Integer.parseInt(sc.nextLine());

        double grapesInKilograms = X * Y;
        double wine = grapesInKilograms * 0.4 / 2.5;

        if(wine >= Z){
            double wineLeft = wine - Z;
            double litersPerWorker = wineLeft / workers;
            System.out.printf("Good harvest this year! Total wine: %.0f liters.", Math.floor(wine));
            System.out.println();
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(wineLeft), Math.ceil(litersPerWorker));
        } else {
            double wineMoreRequired = Z - wine;
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(wineMoreRequired));
        }

        sc.close();
    }
}
