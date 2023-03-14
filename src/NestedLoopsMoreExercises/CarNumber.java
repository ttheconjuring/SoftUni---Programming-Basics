package NestedLoopsMoreExercises;

import java.util.Scanner;

public class CarNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = Integer.parseInt(sc.nextLine());
        int finish = Integer.parseInt(sc.nextLine());

        String combo = "";

        for (int i = start; i <= finish; i++) {
            for (int j = start; j <= finish; j++) {
                for (int k = start; k <= finish; k++) {
                    for (int l = start; l <= finish ; l++) {
                        if((i % 2 == 0 && l % 2 != 0) || (i % 2 != 0 && l % 2 == 0)) {
                            if(i > l) {
                                if((j + k) % 2 == 0) {
                                    combo = i + "" + j + "" + k + "" + l;
                                    System.out.print(combo + " ");
                                }
                            }
                        }
                    }
                }
            }
        }

        sc.close();
    }
}
