package FirstStepsInCodingMoreExercises;

import java.util.Scanner;

public class WeatherForecast2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double degreesCelsius = Double.parseDouble(sc.nextLine());
        if (degreesCelsius >= 5 && degreesCelsius <= 11.9) {
            System.out.println("Cold");
        } else if (degreesCelsius >= 12 && degreesCelsius <= 14.9) {
            System.out.println("Cool");
        } else if (degreesCelsius >= 15 && degreesCelsius <= 20) {
            System.out.println("Mild");
        } else if (degreesCelsius >= 20.1 && degreesCelsius <= 25.9) {
            System.out.println("Warm");
        } else if (degreesCelsius >= 26 && degreesCelsius <= 35) {
            System.out.println("Hot");
        } else {
            System.out.println("unknown");
        }
        sc.close();
    }
}
