package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class MultiplyBy2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number = 0.0;
        while (number >= 0){
            number = Double.parseDouble(sc.nextLine());
            if(number * 2 >= 0) {
                System.out.printf("Result: %.2f", number * 2);
            } else {
                break;
            }
            System.out.println();
        }
        System.out.println("Negative number!");
        sc.close();
    }
}
