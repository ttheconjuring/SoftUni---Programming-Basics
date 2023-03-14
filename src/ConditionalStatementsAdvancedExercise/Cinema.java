package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String projection = sc.nextLine();
        int rows = Integer.parseInt(sc.nextLine());
        int columns = Integer.parseInt(sc.nextLine());

        int area = rows * columns;
        switch (projection){
            case "Premiere":
                System.out.printf("%.2f leva", area * 12.0);
                break;
            case "Normal":
                System.out.printf("%.2f leva", area * 7.5);
                break;
            case "Discount":
                System.out.printf("%.2f leva", area * 5.0);
                break;
            default:
                System.out.println("error");
        }
        sc.close();
    }
}
