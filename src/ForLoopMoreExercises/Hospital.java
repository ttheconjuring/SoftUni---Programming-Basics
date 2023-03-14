package ForLoopMoreExercises;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int period = Integer.parseInt(sc.nextLine());
        int patients;
        int doctors = 7;
        int treated = 0;
        int unTreated = 0;
        int dayCounter = 0;
        for (int i = 0; i < period; i++) {
            patients = Integer.parseInt(sc.nextLine());
            ++dayCounter;
            if (dayCounter == 3) {
                if (unTreated > treated) {
                    ++doctors;
                }
                dayCounter = 0;
            }
            if (patients < doctors) {
                treated += patients;
            } else if (patients == doctors) {
                treated += doctors;
            } else {
                treated += doctors;
                unTreated += patients - doctors;
            }
        }

        System.out.println("Treated patients: " + treated + ".");
        System.out.println("Untreated patients: " + unTreated + ".");

        sc.close();
    }
}
// 0 1 2 3 4 5 6 7 8
// 1 2 3 4 5 6 7 8 9
// - - + - - + - - +