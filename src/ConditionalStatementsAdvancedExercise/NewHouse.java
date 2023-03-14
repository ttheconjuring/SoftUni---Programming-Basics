package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String flowerType = sc.nextLine();
        int flowers = Integer.parseInt(sc.nextLine());
        int budget = Integer.parseInt(sc.nextLine());

        double price = 0.0;
        double discount = 0.0;
        double priceIncrease = 0.0;
        switch (flowerType) {
            case "Roses":
                if (flowers > 80) {
                    price = flowers * 5;
                    discount = price * 0.1;
                    price -= discount;
                } else {
                    price = flowers * 5;
                }
                break;
            case "Dahlias":
                if (flowers > 90) {
                    price = flowers * 3.8;
                    discount = price * 0.15;
                    price -= discount;
                } else {
                    price = flowers * 3.8;
                }
                break;
            case "Tulips":
                if (flowers > 80) {
                    price = flowers * 2.8;
                    discount = price * 0.15;
                    price -= discount;
                } else {
                    price = flowers * 2.8;
                }
                break;
            case "Narcissus":
                if (flowers < 120) {
                    price = flowers * 3;
                    priceIncrease = price * 0.15;
                    price += priceIncrease;
                } else {
                    price = flowers * 3;
                }
                break;
            case "Gladiolus":
                if (flowers < 80) {
                    price = flowers * 2.5;
                    priceIncrease = price * 0.2;
                    price += priceIncrease;
                } else {
                    price = flowers * 2.5;
                }
                break;
            default:
                System.out.println("error");
        }
        if(budget >= price){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowers, flowerType, budget - price);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
        }

        sc.close();
    }
}
