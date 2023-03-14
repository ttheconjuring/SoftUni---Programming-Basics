package ConditionalStatementsLab;

import java.util.Scanner;

public class Number100_200 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        if(x < 100){
            System.out.println("Less than 100");
        } else if(x > 200){
            System.out.println("Greater than 200");
        } else {
            System.out.println("Between 100 and 200");
        }
        sc.close();
    }
}
