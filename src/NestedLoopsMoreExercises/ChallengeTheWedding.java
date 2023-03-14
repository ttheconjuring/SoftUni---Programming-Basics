package NestedLoopsMoreExercises;

import java.util.Scanner;

public class ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int man = Integer.parseInt(sc.nextLine());
        int woman = Integer.parseInt(sc.nextLine());
        int tables = Integer.parseInt(sc.nextLine());

        boolean tablesAreOver = false;

        for (int i = 1; i <= man; i++) {
            for (int j = 1; j <= woman; j++) {
                System.out.printf("(%d <-> %d) ", i, j);
                tables--;
                if(tables == 0) {
                    tablesAreOver = true;
                    break;
                }
            }
            if(tablesAreOver){
                break;
            }
        }

        sc.close();
    }
}
