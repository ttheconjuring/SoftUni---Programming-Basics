package ForLoopExercise;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int number;
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        int counter5 = 0;
        for (int i = 0; i < n; i++) {
            number = Integer.parseInt(sc.nextLine());
            if (number < 200) {
                counter1++;
            } else if (number <= 399) {
                counter2++;
            } else if (number <= 599) {
                counter3++;
            } else if (number <= 799) {
                counter4++;
            } else {
                counter5++;
            }
        }
        System.out.printf("%.2f%%%n", counter1 * 1.0 / n * 100);
        System.out.printf("%.2f%%%n", counter2 * 1.0 / n * 100);
        System.out.printf("%.2f%%%n", counter3 * 1.0 / n * 100);
        System.out.printf("%.2f%%%n", counter4 * 1.0 / n * 100);
        System.out.printf("%.2f%%%n", counter5 * 1.0 / n * 100);
        sc.close();
    }
}
