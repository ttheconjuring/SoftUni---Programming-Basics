package NestedLoopsMoreExercises;

import java.util.Scanner;

public class WeddingSeats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] capitalAlphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        int n = capitalAlphabet.length;

        String lastSector = sc.nextLine();
        int indexOfLastSector = 0;
        for (int i = 0; i < n; i++) {
            if (capitalAlphabet[i].equals(lastSector)) {
                indexOfLastSector = i;
            }
        }

        int rowsInFirstSector = Integer.parseInt(sc.nextLine());
        int oddRow = Integer.parseInt(sc.nextLine());
        int evenRow = oddRow + 2;

        int spotCounter = 0;

        for (int i = 0; i <= indexOfLastSector; i++) {
            for (int j = 1; j <= rowsInFirstSector; j++) {
                if(j % 2 == 0) {
                    for (int k = 0; k < evenRow; k++) {
                        System.out.printf("%s%d%s%n", capitalAlphabet[i], j, capitalAlphabet[k].toLowerCase());
                        spotCounter++;
                    }
                } else {
                    for (int k = 0; k < oddRow; k++) {
                        System.out.printf("%s%d%s%n", capitalAlphabet[i], j, capitalAlphabet[k].toLowerCase());
                        spotCounter++;
                    }
                }
            }
            rowsInFirstSector++;
        }

        System.out.println(spotCounter);

        sc.close();
    }
}