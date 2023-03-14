package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int holidays = Integer.parseInt(sc.nextLine());
        int workingDays = 365 - holidays;

        int holidaysPlayTime = holidays * 127;
        int workingDaysPlayTime = workingDays * 63;
        int totalPlayTime = holidaysPlayTime + workingDaysPlayTime;

        int regularPlayTime = 30000;

        if(regularPlayTime >= totalPlayTime){
            int minutesLeft = regularPlayTime - totalPlayTime;
            int hours = minutesLeft / 60;
            int minutes = minutesLeft % 60;
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", hours, minutes);
        } else {
            int minutesMore = totalPlayTime - regularPlayTime;
            int hours = minutesMore / 60;
            int minutes = minutesMore % 60;
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", hours, minutes);
        }
        sc.close();
    }
}
