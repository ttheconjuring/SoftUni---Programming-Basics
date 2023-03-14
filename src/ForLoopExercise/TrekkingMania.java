package ForLoopExercise;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int groups = Integer.parseInt(sc.nextLine());
        int people;
        int peopleSum = 0;
        int musalaCounter = 0;
        int montBlancCounter = 0;
        int kilimanjaroCounter = 0;
        int k2Counter = 0;
        int everestCounter = 0;

        for (int i = 0; i < groups; i++) {
            people = Integer.parseInt(sc.nextLine());
            peopleSum += people;
            if(people <= 5) {
                musalaCounter += people;
            } else if(people <= 12) {
                montBlancCounter += people;
            } else if(people <= 25) {
                kilimanjaroCounter += people;
            } else if(people <= 40) {
                k2Counter += people;
            } else {
                everestCounter += people;
            }
        }

        System.out.printf("%.2f%% %n", musalaCounter * 1.0 / peopleSum * 100);
        System.out.printf("%.2f%% %n", montBlancCounter * 1.0 / peopleSum * 100);
        System.out.printf("%.2f%% %n", kilimanjaroCounter * 1.0 / peopleSum * 100);
        System.out.printf("%.2f%% %n", k2Counter * 1.0 / peopleSum * 100);
        System.out.printf("%.2f%% %n", everestCounter * 1.0 / peopleSum * 100);

        sc.close();
    }
}
