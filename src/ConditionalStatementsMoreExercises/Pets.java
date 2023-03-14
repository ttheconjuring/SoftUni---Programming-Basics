package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = Integer.parseInt(sc.nextLine());
        int foodLeft = Integer.parseInt(sc.nextLine());
        double dogFoodPerDay = Double.parseDouble(sc.nextLine());
        double catFoodPerDay = Double.parseDouble(sc.nextLine());
        double turtleFoodPerDay = Double.parseDouble(sc.nextLine());

        double totalDogFood = days * dogFoodPerDay;
        double totalCatFood = days * catFoodPerDay;
        double totalTurtleFood = days * (turtleFoodPerDay / 1000);
        double totalFood = totalDogFood + totalTurtleFood + totalCatFood;

        if(totalFood <= foodLeft){
            System.out.printf("%.0f kilos of food left.", (Math.floor(Math.abs(foodLeft - totalFood))));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil((totalFood - foodLeft)));
        }

        sc.close();
    }
}
