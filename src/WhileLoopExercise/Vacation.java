package WhileLoopExercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double requiredMoney = Double.parseDouble(sc.nextLine());
        double moneyOnHand = Double.parseDouble(sc.nextLine());
        String status;
        double moneySpent;
        int dayCounter = 0;
        int spendDays = 0;
        while (moneyOnHand < requiredMoney && spendDays < 5) {
            status = sc.nextLine();
            moneySpent = Double.parseDouble(sc.nextLine());
            dayCounter++;
            switch (status) {
                case "spend":
                    moneyOnHand -= moneySpent;
                    if (moneyOnHand < 0) {
                        moneyOnHand = 0;
                    }
                    spendDays++;
                    break;
                case "save":
                    moneyOnHand += moneySpent;
                    spendDays = 0;
                    break;
                default:
                    System.out.println("error");
            }
        }
        if(moneyOnHand >= requiredMoney) {
            System.out.println("You saved the money for " + dayCounter + " days.");
        } else {
            System.out.println("You can't save the money.");
            System.out.println(dayCounter);
        }
        sc.close();
    }
}
