package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = Integer.parseInt(sc.nextLine());
        int P1 = Integer.parseInt(sc.nextLine());
        int P2 = Integer.parseInt(sc.nextLine());
        double H = Double.parseDouble(sc.nextLine());

        double P1Water = P1 * H;
        double P2Water = P2 * H;
        double P1PlusP2 = P1Water + P2Water;

        if (P1PlusP2 <= V) {
            System.out.println("The pool is " + String.format("%.2f", (P1PlusP2 / V * 100)) + "% full. Pipe 1: " + String.format("%.2f", (P1Water / P1PlusP2 * 100)) + "%. Pipe 2: " + String.format("%.2f", (P2Water / P1PlusP2 * 100)) + ".");
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", H, (P1PlusP2 - V));
        }

        sc.close();
    }
}
