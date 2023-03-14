package ForLoopExercise;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tournaments = Integer.parseInt(sc.nextLine());
        int basePoints = Integer.parseInt(sc.nextLine());
        String status;
        int totalPoints = basePoints;
        int wCounter = 0;
        for (int i = 0; i < tournaments; i++) {
            status = sc.nextLine();
            switch (status) {
                case "W":
                    totalPoints += 2000;
                    wCounter++;
                    break;
                case "F":
                    totalPoints += 1200;
                    break;
                case "SF":
                    totalPoints += 720;
                    break;
                default:
                    System.out.println("error");
            }
        }

        System.out.println("Final points: " + totalPoints);
        System.out.println("Average points: " + ((totalPoints - basePoints) / tournaments));
        System.out.printf("%.2f%%", wCounter * 1.0 / tournaments * 100);

        sc.close();
    }
}
