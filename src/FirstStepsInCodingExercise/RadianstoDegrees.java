package FirstStepsInCodingExercise;

import java.util.Scanner;

public class RadianstoDegrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radians = Double.parseDouble(sc.nextLine());
        double degrees = radians * 180 / Math.PI;
        System.out.println(degrees);
        sc.close();
    }
}
