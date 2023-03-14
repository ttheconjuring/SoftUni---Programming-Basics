package ForLoopExercise;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String actorName = sc.nextLine();
        double academyPoints = Double.parseDouble(sc.nextLine());
        int judge = Integer.parseInt(sc.nextLine());

        double totalPoints = academyPoints;
        String judgeName;
        double judgePoints;
        for (int i = 0; i < judge; i++) {
            judgeName = sc.nextLine();
            judgePoints = Double.parseDouble(sc.nextLine());
            totalPoints += judgeName.length() * judgePoints / 2;
            if (totalPoints > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, totalPoints);
                break;
            }
        }
        if (totalPoints <= 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, 1250.5 - totalPoints);
        }
        sc.close();
    }
}
