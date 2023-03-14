package ForLoopLab;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int number;
        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            number = Integer.parseInt(sc.nextLine());
            leftSum += number;
        }
        int rightSum = 0;
        for (int i = 0; i < n; i++) {
            number = Integer.parseInt(sc.nextLine());
            rightSum += number;
        }
        if(leftSum == rightSum){
            System.out.println("Yes, sum = " + leftSum);
        } else {
            System.out.println("No, diff = " + Math.abs(leftSum - rightSum));
        }
        sc.close();
    }
}
