package ConditionalStatementsLab;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        if(x % 2 == 0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        sc.close();
    }
}
