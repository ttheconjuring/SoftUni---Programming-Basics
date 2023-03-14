package WhileLoopLab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String student = sc.nextLine();
        double grade;
        int counter = 0;
        int i = 1;
        double sum = 0;
        while (i <= 12) {
            grade = Double.parseDouble(sc.nextLine());
            if (grade <= 4) {
                counter++;
                if (counter > 1) {
                    System.out.println(student + " has been excluded at " + i + " grade");
                    break;
                }
                continue;
            } else {
                sum += grade;
                i++;
            }
        }
        if (counter < 1) {
            System.out.println(student + " graduated. Average grade: " + String.format("%.2f", sum / 12));
        }
        sc.close();
    }
}
