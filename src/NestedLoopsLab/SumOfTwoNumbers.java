package NestedLoopsLab;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int beginning = Integer.parseInt(sc.nextLine());
        int end = Integer.parseInt(sc.nextLine());
        int magicalNumber = Integer.parseInt(sc.nextLine());

        boolean flag = false;
        int counter = 0;
        int sum = 0;
        for (int i = beginning; i <= end; i++) {
            for (int j = beginning; j <= end; j++) {
                counter++;
                sum = i + j;
                if (sum == magicalNumber) {
                    flag = true;
                    System.out.printf("Combination N:%d ", counter);
                    System.out.printf("(%d + %d = %d)%n", i, j, i + j);
                    break;
                }
            }
            if(flag) {
                break;
            }
        }

        if(!flag) {
            System.out.printf("%d combinations - neither equals %d", counter, magicalNumber);
        }
        sc.close();
    }
}



