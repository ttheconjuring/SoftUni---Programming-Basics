package ConditionalStatementsExercise;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int duration = Integer.parseInt(sc.nextLine());
        int breakDuration = Integer.parseInt(sc.nextLine());

        double lunchTime = breakDuration * 0.125;
        double freeTime = breakDuration * 0.25;
        double breakDurationLeft = breakDuration - (lunchTime + freeTime);

        if (breakDurationLeft >= duration) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", name, Math.ceil(breakDurationLeft - duration));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", name, Math.ceil(duration - breakDurationLeft));
        }

        sc.close();
    }
}
