package PBExamJava;

import java.util.Scanner;

public class BraceletStand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pocketMoneyPerDay = Double.parseDouble(sc.nextLine());
        double incomePerDay = Double.parseDouble(sc.nextLine());
        double expenses = Double.parseDouble(sc.nextLine());
        double presentPrice = Double.parseDouble(sc.nextLine());

        double savingsFromPocketMoney = 5 * pocketMoneyPerDay;
        double theWholeIncome = 5 * incomePerDay;
        double total = savingsFromPocketMoney + theWholeIncome;
        total = total - expenses;

        if(total >= presentPrice) {
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.", total);
        } else {
            System.out.printf("Insufficient money: %.2f BGN.", presentPrice - total);
        }


        sc.close();
    }
}
