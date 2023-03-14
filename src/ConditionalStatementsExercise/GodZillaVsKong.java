package ConditionalStatementsExercise;

import java.util.Scanner;

public class GodZillaVsKong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        int statists = Integer.parseInt(sc.nextLine());
        double clothesPrice = Double.parseDouble(sc.nextLine());
        double totalClothesPrice = statists * clothesPrice;
        if(statists > 150){
            totalClothesPrice = totalClothesPrice - (totalClothesPrice * 0.1);
        }
        double decor = budget * 0.1;
        budget -= (budget * 0.1);
        budget -= totalClothesPrice;
        if(budget >= 0){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(budget));
        }
        sc.close();
    }
}
