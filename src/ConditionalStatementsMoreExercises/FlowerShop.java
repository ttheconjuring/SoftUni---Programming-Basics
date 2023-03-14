package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int magnolias = Integer.parseInt(sc.nextLine()); // магнолии
        int hyacinths = Integer.parseInt(sc.nextLine()); // зюмбюли
        int roses = Integer.parseInt(sc.nextLine()); // рози
        int cactus = Integer.parseInt(sc.nextLine()); // кактуси
        double giftPrice = Double.parseDouble(sc.nextLine());

        double magnoliasPrice = magnolias * 3.25;
        double hyacinthsPrice = hyacinths * 4;
        double rosesPrice = roses * 3.5;
        double cactusPrice = cactus * 8;
        double totalPrice = magnoliasPrice + hyacinthsPrice + rosesPrice + cactusPrice;
        totalPrice -= totalPrice * 0.05;

        if(totalPrice >= giftPrice){
            System.out.printf("She is left with %.0f leva.", Math.floor(totalPrice - giftPrice));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(giftPrice - totalPrice));
        }

        sc.close();
    }
}
