package ForLoopLab;

import java.util.Scanner;

public class EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int power = Integer.parseInt(sc.nextLine());
        for (int i = 0; i <= power; i += 2) {
            System.out.println((int)Math.pow(2, i));
        }
        sc.close();
    }
}
