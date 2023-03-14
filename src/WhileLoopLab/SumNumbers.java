package WhileLoopLab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.parseInt(sc.nextLine());
        int num;
        int sum = 0;
        while (sum < max) {
            num = Integer.parseInt(sc.nextLine());
            sum += num;
        }
        System.out.println(sum);
        sc.close();
    }
}
