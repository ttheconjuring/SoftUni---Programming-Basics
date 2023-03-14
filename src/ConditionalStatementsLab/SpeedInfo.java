package ConditionalStatementsLab;

import java.util.Scanner;

public class SpeedInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = Double.parseDouble(sc.nextLine());
        if(x <= 10){
            System.out.println("slow");
        } else if(x > 10 && x <= 50){
            System.out.println("average");
        } else if(x > 50 && x <= 150){
            System.out.println("fast");
        } else if(x > 150 && x <= 1000){
            System.out.println("ultra fast");
        } else {
            System.out.println("extremely fast");
        }
        sc.close();
    }
}
