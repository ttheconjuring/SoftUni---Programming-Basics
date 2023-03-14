package NestedLoopsMoreExercises;

import java.util.Scanner;

public class SafePasswordGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int maxPassword = Integer.parseInt(sc.nextLine());

        int passwordCounter = 0;
        boolean isDone = false;

        for (int j = 35; j <= 55; j++) {
            for (int k = 64; k <= 96; k++) {
                for (int l = 1; l <= a; l++) {
                    for (int m = 1; m <= b; m++) {
                        System.out.printf("%s%s%d%d%s%s|", (char) j, (char) k, l, m, (char) k, (char) j);
                        passwordCounter++;
                        j++;
                        k++;
                        if(j > 55) {
                            j = 35;
                        }
                        if(k > 96) {
                            k = 64;
                        }
                        if((passwordCounter == maxPassword) || (l == a && m == b)) {
                            isDone = true;
                            break;
                        }
                    }
                    if(isDone) {
                        break;
                    }
                }
                if(isDone) {
                    break;
                }
            }
            if(isDone) {
                break;
            }
        }
        sc.close();
    }
}
