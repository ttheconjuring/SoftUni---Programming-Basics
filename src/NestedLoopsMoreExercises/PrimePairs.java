package NestedLoopsMoreExercises;

import java.util.Scanner;

public class PrimePairs {

    public static boolean isPrime(int n) {
        int i;
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstStartingValue = Integer.parseInt(sc.nextLine());
        int secondStartingValue = Integer.parseInt(sc.nextLine());
        int firstFinishingValue = Integer.parseInt(sc.nextLine()) + firstStartingValue;
        int secondFinishingValue = Integer.parseInt(sc.nextLine()) + secondStartingValue;

        for (int i = firstStartingValue; i <= firstFinishingValue; i++) {
            for (int j = secondStartingValue; j <= secondFinishingValue; j++) {
                if(isPrime(i)){
                    if(isPrime(j)){
                        System.out.println(String.valueOf(i) + String.valueOf(j));
                    }
                }
            }
        }

        sc.close();
    }
}
