package ConditionalStatementsExercise;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = Integer.parseInt(sc.nextLine());
        double bonus = 0;
        if (result <= 100) {
            bonus += 5;
        } else if(result > 1000){
            bonus += result * 0.1;
        } else {
            bonus += result * 0.2;
        }
        if(result % 2 == 0){
            bonus += 1;
        } else if(result % 10 == 5){
            bonus += 2;
        } else {
            bonus += 0;
        }
        System.out.println(bonus);
        System.out.println(result + bonus);
        sc.close();
    }
}
