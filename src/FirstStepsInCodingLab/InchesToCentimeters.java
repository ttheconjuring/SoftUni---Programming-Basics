package FirstStepsInCodingLab;

import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double inches = Double.parseDouble(sc.nextLine());
        double centimeters = inches * 2.54;
        System.out.println(centimeters);
        sc.close();
    }
}
