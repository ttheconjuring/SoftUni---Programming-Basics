package ForLoopMoreExercises;

import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int number;
        double result = 0;
        double from0To9 = 0;
        double from10To19 = 0;
        double from20To29 = 0;
        double from30To39 = 0;
        double from40To50 = 0;
        double invalid = 0;
        for (int i = 0; i < n; i++) {
            number = Integer.parseInt(sc.nextLine());
            if (number < 0 || number > 50) {
                result /= 2;
                invalid++;
            } else if (number <= 9) {
                result += number * 0.2;
                from0To9++;
            } else if (number <= 19) {
                result += number * 0.3;
                from10To19++;
            } else if (number <= 29) {
                result += number * 0.4;
                from20To29++;
            } else if (number <= 39) {
                result += 50;
                from30To39++;
            } else {
                result += 100;
                from40To50++;
            }
        }
        System.out.printf("%.2f", result);
        System.out.println();
        System.out.printf("From 0 to 9: %.2f%%", from0To9 / n * 100);
        System.out.println();
        System.out.printf("From 10 to 19: %.2f%%", from10To19 / n * 100);
        System.out.println();
        System.out.printf("From 20 to 29: %.2f%%", from20To29 / n * 100);
        System.out.println();
        System.out.printf("From 30 to 39: %.2f%%", from30To39 / n * 100);
        System.out.println();
        System.out.printf("From 40 to 50: %.2f%%", from40To50 / n * 100);
        System.out.println();
        System.out.printf("Invalid numbers: %.2f%%", invalid / n * 100);
        sc.close();
    }
}
