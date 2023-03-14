package FirstStepsInCodingMoreExercises;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius = Double.parseDouble(sc.nextLine());
        double fahrenheit = celsius * 1.8 + 32;
        System.out.printf("%.2f", fahrenheit);
        sc.close();
    }
}
