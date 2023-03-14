package ForLoopLab;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int number;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            number = Integer.parseInt(sc.nextLine());
            if (number > max) {
                max = number;
            }
            if(number < min){
                min = number;
            }
        }
        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);
        sc.close();
    }
}
