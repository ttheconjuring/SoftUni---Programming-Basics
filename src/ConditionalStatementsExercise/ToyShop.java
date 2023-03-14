package ConditionalStatementsExercise;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double excursionPrice = Double.parseDouble(sc.nextLine());
        int puzzles = Integer.parseInt(sc.nextLine());
        int speakingDolls = Integer.parseInt(sc.nextLine());
        int teddyBears = Integer.parseInt(sc.nextLine());
        int minions = Integer.parseInt(sc.nextLine());
        int trucks = Integer.parseInt(sc.nextLine());

        int toysSum = puzzles + speakingDolls + teddyBears + minions + trucks;

        double puzzlesPrice = puzzles * 2.6;
        double speakingDollsPrice = speakingDolls * 3;
        double teddyBearsPrice = teddyBears * 4.1;
        double minionsPrice = minions * 8.2;
        double trucksPrice = trucks * 2;

        double totalPrice = puzzlesPrice + speakingDollsPrice + teddyBearsPrice + minionsPrice + trucksPrice;

        if(toysSum >= 50){
            totalPrice = totalPrice - (totalPrice * 0.25);
        }

        totalPrice = totalPrice - (totalPrice * 0.1);

        if(totalPrice >= excursionPrice){
            System.out.printf("Yes! %.2f lv left.", (totalPrice - excursionPrice));
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", (Math.abs(excursionPrice - totalPrice)));
        }

        sc.close();
    }
}
