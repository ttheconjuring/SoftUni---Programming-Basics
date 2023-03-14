package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1 = Integer.parseInt(sc.nextLine());
        int N2 = Integer.parseInt(sc.nextLine());
        String symbol = sc.nextLine();

        double result = 0.0;
        double n1 = N1 * 1.0;
        double n2 = N2 * 1.0;
        switch (symbol) {
            case "+":
                result = N1 + N2;
                if (result % 2 == 0) {
                    System.out.println(N1 + " + " + N2 + " = " + (int) result + " - even");
                } else {
                    System.out.println(N1 + " + " + N2 + " = " + (int) result + " - odd");
                }
                break;
            case "-":
                result = N1 - N2;
                if (result % 2 == 0) {
                    System.out.println(N1 + " - " + N2 + " = " + (int) result + " - even");
                } else {
                    System.out.println(N1 + " - " + N2 + " = " + (int) result + " - odd");
                }
                break;
            case "*":
                result = N1 * N2;
                if (result % 2 == 0) {
                    System.out.println(N1 + " * " + N2 + " = " + (int) result + " - even");
                } else {
                    System.out.println(N1 + " * " + N2 + " = " + (int) result + " - odd");
                }
                break;
            case "/":
                if (n2 != 0) {
                    result = n1 / n2;
                    System.out.println(N1 + " / " + N2 + " = " + String.format("%.2f", result));
                } else {
                    System.out.println("Cannot divide " + N1 + " by zero");
                }
                break;
            case "%":
                if (n2 != 0) {
                    result = n1 % n2;
                    System.out.println(N1 + " % " + N2 + " = " + (int) result);
                } else {
                    System.out.println("Cannot divide " + N1 + " by zero");
                }
                break;
            default:
                System.out.println("error");
        }

        sc.close();
    }
}
