package WhileLoopExercise;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int poorGrades = Integer.parseInt(sc.nextLine());
        String exerciseName = "";
        int grade;
        int poorGradeCounter = 0;
        int exerciseCounter = 0;
        double sum = 0;
        String lastExercise = "";
        while (poorGradeCounter != poorGrades) {
            exerciseName = sc.nextLine();
            if (!exerciseName.equals("Enough")) {
                lastExercise = exerciseName;
            } else {
                break;
            }
            grade = Integer.parseInt(sc.nextLine());
            if (grade <= 4) {
                poorGradeCounter++;
            }
            sum += grade;
            exerciseCounter++;
        }
        if (poorGrades == poorGradeCounter) {
            System.out.println("You need a break, " + poorGradeCounter + " poor grades.");
        } else {
            System.out.println("Average score: " + String.format("%.2f", sum / exerciseCounter));
            System.out.println("Number of problems: " + exerciseCounter);
            System.out.println("Last problem: " + lastExercise);
        }

        sc.close();
    }
}
