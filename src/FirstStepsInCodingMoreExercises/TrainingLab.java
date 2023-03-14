package FirstStepsInCodingMoreExercises;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double widthInMeters = Double.parseDouble(sc.nextLine());
        double heightInMeters = Double.parseDouble(sc.nextLine());
        double widthInCentimeters = widthInMeters * 100;
        double heightInCentimeters = heightInMeters * 100 - 100;

        double widthSpaces = Math.floor(widthInCentimeters / 120);
        double heightSpaces = Math.floor(heightInCentimeters / 70);

        double availableSpaces = widthSpaces * heightSpaces - 3;
        System.out.println((int)availableSpaces);

        sc.close();
    }
}
