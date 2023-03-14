package ConditionalStatementsExercise;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        int GPUs = Integer.parseInt(sc.nextLine());
        int CPUs = Integer.parseInt(sc.nextLine());
        int RAMs = Integer.parseInt(sc.nextLine());

        double GPUsPrice = GPUs * 250;
        double CPUsPrice = CPUs * (GPUsPrice * 0.35);
        double RAMsPrice = RAMs * (GPUsPrice * 0.1);

        double totalPrice = GPUsPrice + CPUsPrice + RAMsPrice;

        if(GPUs > CPUs){
            totalPrice = totalPrice - (totalPrice * 0.15);
        }
        budget -= totalPrice;
        if(budget >= 0){
            System.out.printf("You have %.2f leva left!", budget);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", Math.abs(budget));
        }

        sc.close();
    }
}
