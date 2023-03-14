package ForLoopMoreExercises;

import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int tons;
        int vanTons = 0;
        int truckTons = 0;
        int trainTons = 0;
        int sumTons = 0;
        for (int i = 0; i < n; i++) {
            tons = Integer.parseInt(sc.nextLine());
            sumTons += tons;
            if (tons <= 3) {
                vanTons += tons;
            } else if (tons <= 11) {
                truckTons += tons;
            } else {
                trainTons += tons;
            }
        }
        double vansLv = vanTons * 200;
        double trucksLv = truckTons * 175;
        double trainsLv = trainTons * 120;
        double averageLvPerTon = (vansLv + trucksLv + trainsLv) / sumTons;
        System.out.printf("%.2f", averageLvPerTon);
        System.out.println();
        System.out.printf("%.2f%%", (vanTons * 1.0 / sumTons * 100));
        System.out.println();
        System.out.printf("%.2f%%", (truckTons * 1.0 / sumTons * 100));
        System.out.println();
        System.out.printf("%.2f%%", (trainTons * 1.0 / sumTons * 100));

        sc.close();
    }
}
