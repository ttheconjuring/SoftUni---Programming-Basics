package NestedLoopsMoreExercises;

import java.util.Scanner;

public class LettersCombinations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String start = sc.nextLine();
        String finish = sc.nextLine();
        String exception = sc.nextLine();

        int combination = 0;
        String combo = "";

        int asciiValueOfStart = 0;
        for (int i = 0; i < start.length(); i++) {
            asciiValueOfStart = start.charAt(i);
        }

        int asciiValueOfFinish = 0;
        for (int i = 0; i < finish.length(); i++) {
            asciiValueOfFinish = finish.charAt(i);
        }

        for (int i = asciiValueOfStart; i <= asciiValueOfFinish; i++) {
            for (int j = asciiValueOfStart; j <= asciiValueOfFinish ; j++) {
                for (int k = asciiValueOfStart; k <= asciiValueOfFinish ; k++) {
                    combo = String.valueOf((char)i) + String.valueOf((char)j) + String.valueOf((char)k) + " ";
                    if(!combo.contains(exception)) {
                        combination++;
                        System.out.print(combo);
                    }
                }
            }
        }
        System.out.print(combination);

        sc.close();
    }
}
