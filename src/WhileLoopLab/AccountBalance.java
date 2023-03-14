package WhileLoopLab;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        String money;
        double cash;
        while (true) {
            money = sc.nextLine();
            if(!money.equals("NoMoreMoney")) {
                cash = Double.parseDouble(String.valueOf(money));
            } else {
                break;
            }
            if(cash < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f%n", cash);
            sum += cash;
        }
        System.out.printf("Total: %.2f%n", sum);
        sc.close();
    }
}
