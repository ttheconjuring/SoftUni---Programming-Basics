package ForLoopExercise;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        double washingMachinePrice = Double.parseDouble(sc.nextLine());
        int toyPrice = Integer.parseInt(sc.nextLine());
        int toys = 0;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
              sum += i / 2 * 10 - 1;
            } else {
                toys++;
            }
        }
        sum += toys * toyPrice;
        if(sum >= washingMachinePrice){
            System.out.printf("Yes! %.2f", sum - washingMachinePrice);
        } else {
            System.out.printf("No! %.2f", Math.abs(sum - washingMachinePrice));
        }
        sc.close();
    }
}
