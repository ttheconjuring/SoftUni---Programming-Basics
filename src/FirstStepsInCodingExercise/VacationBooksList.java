package FirstStepsInCodingExercise;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int allPages = Integer.parseInt(sc.nextLine());
        int pagesPerHour = Integer.parseInt(sc.nextLine());
        int days = Integer.parseInt(sc.nextLine());
        int timeRequired = allPages / pagesPerHour;
        int readingHours = timeRequired  / days;
        System.out.println(readingHours);
        sc.close();
    }
}
