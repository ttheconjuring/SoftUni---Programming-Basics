package WhileLoopMoreExecises;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        double sum = 0;
        int number;
        for (int i = 0; i < n; i++) {
            number = Integer.parseInt(sc.nextLine());
            sum += number;
        }
        System.out.printf("%.2f", sum/n);
        sc.close();
    }
}
