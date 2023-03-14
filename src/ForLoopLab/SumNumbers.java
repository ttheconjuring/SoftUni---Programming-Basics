package ForLoopLab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        int number = 0;
        for (int i = 0; i < n; i++) {
            number = Integer.parseInt(sc.nextLine());
            sum += number;
        }
        System.out.println(sum);
        sc.close();
    }
}

