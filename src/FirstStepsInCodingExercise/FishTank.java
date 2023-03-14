package FirstStepsInCodingExercise;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = Integer.parseInt(sc.nextLine());
        int width = Integer.parseInt(sc.nextLine());
        int height = Integer.parseInt(sc.nextLine());
        double percent = Double.parseDouble(sc.nextLine());
        double capacity = length * width * height;
        double capacityInLitres = capacity / 1000;
        double litresRequired = capacityInLitres * (1 - (percent / 100));
        System.out.println(litresRequired);
        sc.close();
    }
}
