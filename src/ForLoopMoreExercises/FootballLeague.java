package ForLoopMoreExercises;

import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stadiumCapacity = Integer.parseInt(sc.nextLine());
        int fans = Integer.parseInt(sc.nextLine());
        String sector;
        double aFans = 0;
        double bFans = 0;
        double vFans = 0;
        double gFans = 0;
        for (int i = 0; i < fans; i++) {
            sector = sc.nextLine();
            switch (sector) {
                case "A":
                    aFans++;
                    break;
                case "B":
                    bFans++;
                    break;
                case "V":
                    vFans++;
                    break;
                case "G":
                    gFans++;
                    break;
                default:
                    System.out.println("error");
            }
        }
        System.out.printf("%.2f%%", aFans / fans * 100);
        System.out.println();
        System.out.printf("%.2f%%", bFans / fans * 100);
        System.out.println();
        System.out.printf("%.2f%%", vFans / fans * 100);
        System.out.println();
        System.out.printf("%.2f%%", gFans / fans * 100);
        System.out.println();
        System.out.printf("%.2f%%", fans * 1.0 / stadiumCapacity * 100);
        sc.close();
    }
}
