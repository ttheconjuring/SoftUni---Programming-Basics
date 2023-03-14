package PBExamJava;

import java.util.Scanner;

public class HairSalon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idea = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();

        int sum = 0;

        while (!input.equals("closed")) {
            if (input.equals("haircut")) {
                input = sc.nextLine();
                if (input.equals("mens")) {
                    sum = sum + 15;
                    if(sum >= idea){
                        break;
                    }
                } else if (input.equals("ladies")) {
                    sum = sum + 20;
                    if(sum >= idea){
                        break;
                    }
                } else {
                    sum = sum + 10;
                    if(sum >= idea){
                        break;
                    }
                }
            } else {
                input = sc.nextLine();
                if (input.equals("touch up")) {
                    sum = sum + 20;
                    if(sum >= idea){
                        break;
                    }
                } else {
                    sum = sum + 30;
                    if(sum >= idea){
                        break;
                    }
                }
            }
            input = sc.nextLine();
        }

        if(input.equals("closed")) {
            System.out.printf("Target not reached! You need %dlv. more.%n", idea - sum);
            System.out.printf("Earned money: %dlv.", sum);
        } else {
            System.out.println("You have reached your target for the day!");
            System.out.printf("Earned money: %dlv.", sum);
        }


        sc.close();
    }
}
