package NestedLoopsMoreExercises;

import java.util.Scanner;

public class SunOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = Integer.parseInt(sc.nextLine());
        int finish = Integer.parseInt(sc.nextLine());
        int magicalNumber = Integer.parseInt(sc.nextLine());

        int sum;
        boolean isFound = false;
        int combinationsCounter = 0;

        for (int i = start; i <= finish; i++) {
            for (int j = start; j <= finish; j++) {
                combinationsCounter++;
                sum = i + j;
                if(sum == magicalNumber) {
                    isFound = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)", combinationsCounter, i, j, magicalNumber);
                    break;
                }
            }
            if(isFound) {
                break;
            }
        }

        if(!isFound) {
            System.out.println(combinationsCounter + " combinations - neither equals " + magicalNumber);
        }


        sc.close();
    }
}
