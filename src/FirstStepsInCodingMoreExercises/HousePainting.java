package FirstStepsInCodingMoreExercises;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = Double.parseDouble(sc.nextLine());
        double y = Double.parseDouble(sc.nextLine());
        double h = Double.parseDouble(sc.nextLine());

        double frontWall = Math.pow(x, 2) - (1.2 * 2);
        double backWall = Math.pow(x, 2);
        double sideWall = (x * y) - (Math.pow(1.5, 2));
        double greenArea = frontWall + backWall + 2 * sideWall;
        double litresOfGreenPaintRequired = greenArea / 3.4;
        System.out.printf("%.2f", litresOfGreenPaintRequired);

        System.out.println();

        double roofRectangle = x * y;
        double roofTriangle = h * x / 2;
        double redArea = 2 * roofRectangle + 2 * roofTriangle;
        double litersOfRedPaintRequired = redArea / 4.3;
        System.out.printf("%.2f", litersOfRedPaintRequired);

        sc.close();
    }
}
