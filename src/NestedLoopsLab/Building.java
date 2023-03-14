package NestedLoopsLab;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stages = Integer.parseInt(sc.nextLine());
        int rooms = Integer.parseInt(sc.nextLine());

        for (int i = stages; i >= 1; i--) {
            for (int j = 0; j < rooms; j++) {
                if(i == stages) {
                    System.out.printf("L%d%d ", i, j);
                    if(j == rooms - 1) {
                        System.out.println();
                    }
                    continue;
                }
                if(i % 2 == 0) {
                    System.out.printf("O%d%d ", i, j);
                } else {
                    System.out.printf("A%d%d ", i, j);
                }
                if(j == rooms - 1) {
                    System.out.println();
                }
            }
        }
        sc.close();
    }
}
