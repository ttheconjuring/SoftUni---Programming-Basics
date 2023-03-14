package NestedLoopsExercise;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String presentationName = sc.nextLine();
        double grade;
        double averagePresentationGrade = 0;
        double averageAtAll = 0;
        int presentationCounter = 0;
        while (!presentationName.equals("Finish")) {
            presentationCounter++;
            for (int i = 0; i < n; i++) {
                grade = Double.parseDouble(sc.nextLine());
                averagePresentationGrade += grade;
                averageAtAll += grade;
            }
            averagePresentationGrade /= n;
            System.out.printf("%s - %.2f.%n", presentationName, averagePresentationGrade);
            averagePresentationGrade = 0;
            presentationName = sc.nextLine();
        }
        averageAtAll /= (n * presentationCounter);
        System.out.printf("Student's final assessment is %.2f.", averageAtAll);
        sc.close();
    }
}
