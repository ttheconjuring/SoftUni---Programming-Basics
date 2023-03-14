package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        if((n >= 100 && n <= 200) || n == 0){
            System.out.println("");
        } else {
            System.out.println("invalid");
        }
        sc.close();
    }
}
