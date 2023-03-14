package FirstStepsInCodingMoreExercises;

import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = Double.parseDouble(sc.nextLine());
        System.out.printf("%.2f", (Math.PI * Math.pow(r, 2)));
        System.out.println();
        System.out.printf("%.2f", (2 * Math.PI * r));
        sc.close();
    }
}
