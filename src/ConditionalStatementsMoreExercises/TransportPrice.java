package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String word = sc.nextLine();

        double price = 0.0;
        if(n >= 100){
            price = n * 0.06;
        } else if(n >= 20){
            price = n * 0.09;
        } else {
            if(word.equals("day")){
                price = n * 0.79 + 0.7;
            } else {
                price = n * 0.9 + 0.7;
            }
        }
        System.out.printf("%.2f", price);

        sc.close();
    }
}
