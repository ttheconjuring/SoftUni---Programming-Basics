package FirstStepsInCodingExercise;

import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double USD = Double.parseDouble(sc.nextLine());
        double BGN = USD * 1.79549;
        System.out.println(BGN);
        sc.close();

    }
}
