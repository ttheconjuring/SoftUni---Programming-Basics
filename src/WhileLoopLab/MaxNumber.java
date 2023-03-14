package WhileLoopLab;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int max = Integer.MIN_VALUE;
        int num = 0;
        while (!input.equals("Stop")) {
            num = Integer.parseInt(input);
            if (num > max) {
                max = num;
            }
            input = sc.nextLine();
        }
        System.out.println(max);
        sc.close();
    }
}
