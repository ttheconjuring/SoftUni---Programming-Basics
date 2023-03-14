package ForLoopMoreExercises;

import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int months = Integer.parseInt(sc.nextLine());
        double electricity;
        double electricitySum = 0;
        double waterSum = 0;
        double internetSum = 0;
        double othersSum = 0;
        for (int i = 0; i < months; i++) {
           electricity = Double.parseDouble(sc.nextLine());
           electricitySum += electricity;
           waterSum += 20;
           internetSum += 15;
           othersSum += ((electricity + 20 + 15) + (electricity + 20 + 15) * 0.2);
        }
        double bills = electricitySum + waterSum + internetSum + othersSum;
        System.out.printf("Electricity: %.2f lv", electricitySum);
        System.out.println();
        System.out.printf("Water: %.2f lv", waterSum);
        System.out.println();
        System.out.printf("Internet: %.2f lv", internetSum);
        System.out.println();
        System.out.printf("Other: %.2f lv", othersSum);
        System.out.println();
        System.out.printf("Average: %.2f lv", bills / months);
        sc.close();
    }
}
