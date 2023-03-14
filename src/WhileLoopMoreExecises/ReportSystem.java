package WhileLoopMoreExecises;

import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int charityAmount = Integer.parseInt(sc.nextLine());
        String amount = "";
        int objectPrice;
        int amountCollected = 0;
        int counter = 0;
        int cashPaymentCounter = 0;
        double cashAmount = 0;
        int cardPaymentCounter = 0;
        double cardAmount = 0;
        while (amountCollected < charityAmount) {
            amount = sc.nextLine();
            if(amount.equals("End")) {
                break;
            }
            objectPrice = Integer.parseInt(amount);
            if(counter == 0) {
                counter++;
                if(objectPrice > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    amountCollected += objectPrice;
                    System.out.println("Product sold!");
                    cashAmount += objectPrice;
                    cashPaymentCounter++;
                }
            } else {
                if(objectPrice < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    amountCollected += objectPrice;
                    System.out.println("Product sold!");
                    cardAmount += objectPrice;
                    cardPaymentCounter++;
                }
                counter = 0;
            }
        }
        if(amount.equals("End")) {
            System.out.println("Failed to collect required money for charity.");
        } else {
            System.out.printf("Average CS: %.2f%n", cashAmount / cashPaymentCounter);
            System.out.printf("Average CC: %.2f%n", cardAmount / cardPaymentCounter);
        }
        sc.close();
    }
}
