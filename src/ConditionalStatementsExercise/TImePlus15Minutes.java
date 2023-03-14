package ConditionalStatementsExercise;

import java.util.Scanner;

public class TImePlus15Minutes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hours = Integer.parseInt(sc.nextLine());
        int minutes = Integer.parseInt(sc.nextLine());
        int hoursPlus1 = hours + 1;
        int minutesPlus15 = minutes + 15;
        int minutes60 = minutesPlus15 % 60;
        if (minutesPlus15 <= 59) {
            System.out.printf("%d:%d", hours, minutesPlus15);
        } else if(hoursPlus1 != 24) {
            if (minutes60 < 10) {
                System.out.printf("%d:0%d", hoursPlus1, minutes60);
            } else {
                System.out.printf("%d:%d", hoursPlus1, minutes60);
            }
        } else {
            hoursPlus1 = 0;
            if (minutes60 < 10) {
                System.out.printf("%d:0%d", hoursPlus1, minutes60);
            } else {
                System.out.printf("%d:%d", hoursPlus1, minutes60);
            }
        }
        sc.close();
    }
}
