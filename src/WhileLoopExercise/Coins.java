package WhileLoopExercise;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cashback = Double.parseDouble(sc.nextLine());

        int coinCounter = 0;

        cashback = Math.ceil(Math.floor(cashback * 100));

        while (cashback - 200 >= 0) {
            cashback -= 200;
            coinCounter++;
        }
        while (cashback - 100 >= 0) {
            cashback -= 100;
            coinCounter++;
        }
        while (cashback - 50 >= 0) {
            cashback -= 50;
            coinCounter++;
        }
        while (cashback - 20 >= 0) {
            cashback -= 20;
            coinCounter++;
        }
        while (cashback - 10 >= 0) {
            cashback -= 10;
            coinCounter++;
        }
        while (cashback - 5 >= 0) {
            cashback -= 5;
            coinCounter++;
        }
        while (cashback - 2 >= 0) {
            cashback -= 2;
            coinCounter++;
        }
        while (cashback - 1 >= 0) {
            cashback -= 1;
            coinCounter++;
        }
        System.out.println(coinCounter);
        sc.close();
    }
}
