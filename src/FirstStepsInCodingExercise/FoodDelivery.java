package FirstStepsInCodingExercise;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chickenMenus = Integer.parseInt(sc.nextLine());
        int fishMenus = Integer.parseInt(sc.nextLine());
        int vegetarianMenus = Integer.parseInt(sc.nextLine());
        double chickenMenusPrice = chickenMenus * 10.35;
        double fishMenusPrice = fishMenus * 12.4;
        double vegetarianMenusPrice = vegetarianMenus * 8.15;
        double sum = chickenMenusPrice + fishMenusPrice + vegetarianMenusPrice;
        double dessert = sum * 0.2;
        double allExpenses = sum + dessert + 2.5;
        System.out.println(allExpenses);
        sc.close();
    }
}
