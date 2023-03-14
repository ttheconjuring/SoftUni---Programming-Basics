package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        if((n >= -100 && n <= 100) && n != 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
