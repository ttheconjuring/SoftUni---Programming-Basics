package NestedLoopsExercise;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String number;
        int digit;
        boolean isValid = false;
        for (int i = 1111; i <= 9999 ; i++) {
            number = String.valueOf(i);
            for (int j = 0; j < number.length(); j++) {
                digit = Integer.parseInt(String.valueOf(number.charAt(j)));
                if(digit == 0) {
                    isValid = false;
                    break;
                }
                if(n % digit == 0) {
                    isValid = true;
                    continue;
                } else {
                    isValid = false;
                    break;
                }
            }
            if(isValid) {
                System.out.print(i + " ");
            }
        }
        
        sc.close();
    }
}
