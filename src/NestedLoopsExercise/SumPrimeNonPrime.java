package NestedLoopsExercise;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int currentNum;
        int sumOfPrimeNumbers = 0;
        int sumOfNonPrimeNumbers = 0;
        while (!num.equals("stop")) {
            currentNum = Integer.parseInt(num);
            if (currentNum < 0) {
                System.out.println("Number is negative.");
                num = sc.nextLine();
            } else {
                if (isPrime(currentNum)) {
                    sumOfPrimeNumbers += currentNum;
                } else {
                    sumOfNonPrimeNumbers += currentNum;
                }
                num = sc.nextLine();
            }
        }
        System.out.println("Sum of all prime numbers is: " + sumOfPrimeNumbers);
        System.out.println("Sum of all non prime numbers is: " + sumOfNonPrimeNumbers);
        sc.close();
    }
}
