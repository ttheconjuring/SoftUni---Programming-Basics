package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int degrees = Integer.parseInt(sc.nextLine());
        String dayTime = sc.nextLine();

        switch (dayTime) {
            case "Morning":
                if(degrees >= 10 && degrees <= 18){
                    System.out.println("It's " + degrees + " degrees, get your Sweatshirt and Sneakers.");
                } else if(degrees > 18 && degrees <= 24){
                    System.out.println("It's " + degrees + " degrees, get your Shirt and Moccasins.");
                } else if(degrees >= 25){
                    System.out.println("It's " + degrees + " degrees, get your T-Shirt and Sandals.");
                } else {
                    System.out.println("error");
                }
                break;
            case "Afternoon":
                if(degrees >= 10 && degrees <= 18){
                    System.out.println("It's " + degrees + " degrees, get your Shirt and Moccasins.");
                } else if(degrees > 18 && degrees <= 24){
                    System.out.println("It's " + degrees + " degrees, get your T-Shirt and Sandals.");
                } else if(degrees >= 25){
                    System.out.println("It's " + degrees + " degrees, get your Swim Suit and Barefoot.");
                } else {
                    System.out.println("error");
                }
                break;
            case "Evening":
                if(degrees >= 10 && degrees <= 18){
                    System.out.println("It's " + degrees + " degrees, get your Shirt and Moccasins.");
                } else if(degrees > 18 && degrees <= 24){
                    System.out.println("It's " + degrees + " degrees, get your Shirt and Moccasins.");
                } else if(degrees >= 25){
                    System.out.println("It's " + degrees + " degrees, get your Shirt and Moccasins.");
                } else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
        }

        sc.close();
    }
}
