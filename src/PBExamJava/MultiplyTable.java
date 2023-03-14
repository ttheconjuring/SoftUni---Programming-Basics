package PBExamJava;

import java.util.Scanner;

public class MultiplyTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        String number = String.valueOf(n);
        // String newNumber = String.valueOf(number.charAt(2)) + String.valueOf(number.charAt(1)) + String.valueOf(number.charAt(0));

        // int newN = Integer.parseInt(newNumber);

        int firstDigit = Integer.parseInt(String.valueOf(number.charAt(2)));
        int middleDigit = Integer.parseInt(String.valueOf(number.charAt(1)));
        int lastDigit = Integer.parseInt(String.valueOf(number.charAt(0)));

        for (int i = 1; i <= firstDigit ; i++) {
            for (int j = 1; j <= middleDigit ; j++) {
                for (int k = 1; k <= lastDigit ; k++) {
                    System.out.println(i + " * " + j + " * " + k + " = " + i * j * k + ";");
                }
            }

        }

        sc.close();
    }
}
