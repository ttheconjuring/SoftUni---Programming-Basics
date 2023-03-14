package WhileLoopLab;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int min = Integer.MAX_VALUE;
        int num = 0;
        while (!input.equals("Stop")) {
            num = Integer.parseInt(input);
            if (num < min) {
                min = num;
            }
            input = sc.nextLine();
        }
        System.out.println(min);
        sc.close();
    }
}

