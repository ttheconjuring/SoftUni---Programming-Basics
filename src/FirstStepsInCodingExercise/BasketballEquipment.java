package FirstStepsInCodingExercise;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int annualFee = Integer.parseInt(sc.nextLine());
        double sneakers = annualFee - (annualFee * 0.4);
        double outfit = sneakers - (sneakers * 0.2);
        double ball = outfit * 0.25;
        double accessories = ball * 0.2;
        double sum = annualFee + sneakers + outfit + ball + accessories;
        System.out.println(sum);
        sc.close();
    }
}
