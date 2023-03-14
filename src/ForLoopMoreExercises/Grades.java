package ForLoopMoreExercises;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = Integer.parseInt(sc.nextLine());
        double grade;
        double topStudents = 0;
        double between4And499 = 0;
        double between3And399 = 0;
        double fails = 0;
        double averageGrade = 0;
        for (int i = 0; i < students; i++) {
            grade = Double.parseDouble(sc.nextLine());
            averageGrade += grade;
            if (grade < 3) {
                fails++;
            } else if (grade < 4) {
                between3And399++;
            } else if (grade < 5) {
                between4And499++;
            } else {
                topStudents++;
            }
        }
        System.out.printf("Top students: %.2f%%", topStudents / students * 100);
        System.out.println();
        System.out.printf("Between 4.00 and 4.99: %.2f%%", between4And499 / students * 100);
        System.out.println();
        System.out.printf("Between 3.00 and 3.99: %.2f%%", between3And399 / students * 100);
        System.out.println();
        System.out.printf("Fail: %.2f%%", fails / students * 100);
        System.out.println();
        System.out.printf("Average: %.2f", averageGrade / students);
        sc.close();
    }
}
