package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int examHour = Integer.parseInt(sc.nextLine());
        int examMinute = Integer.parseInt(sc.nextLine());
        int arrivalHour = Integer.parseInt(sc.nextLine());
        int arrivalMinute = Integer.parseInt(sc.nextLine());

        int examMinutes = examHour * 60 + examMinute;
        int arrivalMinutes = arrivalHour * 60 + arrivalMinute;
        int theMaxEarlierTimeArrival = examMinutes - 30;

        if (examMinutes < arrivalMinutes) {
            System.out.println("Late");
            if(arrivalMinutes - examMinutes < 60 && ((arrivalMinutes - examMinutes) % 60) > 9) {
                System.out.println(arrivalMinutes - examMinutes + " minutes after the start");
            } else if(arrivalMinutes - examMinutes > 60 && ((arrivalMinutes - examMinutes) % 60) < 10){
                System.out.printf("%d:0%d hours after the start", ((arrivalMinutes - examMinutes) / 60), ((arrivalMinutes - examMinutes) % 60));
            } else {
                System.out.printf("%d:%d hours after the start", ((arrivalMinutes - examMinutes) / 60), ((arrivalMinutes - examMinutes) % 60));
            }
        } else if (examMinutes == arrivalMinutes) {
            System.out.println("On Time");
        } else if (theMaxEarlierTimeArrival <= arrivalMinutes) {
            System.out.println("On time");
            System.out.println(examMinutes - arrivalMinutes + " minutes before the start");
        } else {
            System.out.println("Early");
            if(examMinutes - arrivalMinutes < 60 && ((examMinutes - arrivalMinutes) % 60) > 9) {
                System.out.println(examMinutes - arrivalMinutes + " minutes before the start");
            } else if(examMinutes - arrivalMinutes > 60 && ((examMinutes - arrivalMinutes) % 60) < 10){
                System.out.printf("%d:0%d hours before the start", ((examMinutes - arrivalMinutes) / 60), ((examMinutes - arrivalMinutes) % 60));
            } else {
                System.out.printf("%d:%d hours before the start", ((examMinutes - arrivalMinutes) / 60), ((examMinutes - arrivalMinutes) % 60));
            }
        }

        sc.close();
    }
}
//        ---> OnTimeForTheExam <---
//
//        1) On time - just on time (done)
//        2) On time - 30min max earlier
//        3) Early - more than 30min earlier
//        4) Late - after the exam time
//
//        Examples:
//        1) 12:30 - 0 == 12:30 (just on time) - done
//
//        2) 12:30 - 30 == 12:00 (the earliest time)
//        12:30 - 20 == 12:10
//        12:30 - 10 == 12:20
//
//
//
//        3) 12:30 - 40 == 11:10 (extremely earlier)
//        12:30 - 50 == 11:20
//        12:30 - 60 == 11:30
//
//        4) 12:30 + 10 == 12:40 (after the exam time)
//        12:30 + 20 == 12:50
//        12:30 + 30 == 13:00