package WhileLoopLab;

import java.util.Scanner;

public class Sequence2KPlus1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int num = 1;
        while (true) {
            if (num <= n) {
                System.out.println(num);
                num = num * 2 + 1;
            } else {
                break;
            }
        }
        sc.close();
    }
}
