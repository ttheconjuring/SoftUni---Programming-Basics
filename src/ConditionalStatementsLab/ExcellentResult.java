package ConditionalStatementsLab;

import java.util.Scanner;

public class ExcellentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = Integer.parseInt(sc.nextLine());
        if(result >= 5){
            System.out.println("Excellent!");
        }
        sc.close();
    }
}
