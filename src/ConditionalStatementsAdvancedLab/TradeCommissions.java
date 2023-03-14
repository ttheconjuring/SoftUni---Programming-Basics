package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String city = sc.nextLine();
        double salesQuantity = Double.parseDouble(sc.nextLine());
        switch (city){
            case "Sofia":
                if(salesQuantity >= 0 && salesQuantity <= 500){
                    System.out.printf("%.2f", salesQuantity * 0.05);
                } else if(salesQuantity > 500 && salesQuantity <= 1000){
                    System.out.printf("%.2f", salesQuantity * 0.07);
                } else if(salesQuantity > 1000 && salesQuantity <= 10000){
                    System.out.printf("%.2f", salesQuantity * 0.08);
                } else if(salesQuantity > 10000) {
                    System.out.printf("%.2f", salesQuantity * 0.12);
                } else {
                    System.out.println("error");
                }
                break;
            case "Varna":
                if(salesQuantity >= 0 && salesQuantity <= 500){
                    System.out.printf("%.2f", salesQuantity * 0.045);
                } else if(salesQuantity > 500 && salesQuantity <= 1000){
                    System.out.printf("%.2f", salesQuantity * 0.075);
                } else if(salesQuantity > 1000 && salesQuantity <= 10000){
                    System.out.printf("%.2f", salesQuantity * 0.1);
                } else if(salesQuantity > 10000) {
                    System.out.printf("%.2f", salesQuantity * 0.13);
                } else {
                    System.out.println("error");
                }
                break;
            case "Plovdiv":
                if(salesQuantity >= 0 && salesQuantity <= 500){
                    System.out.printf("%.2f", salesQuantity * 0.055);
                } else if(salesQuantity > 500 && salesQuantity <= 1000){
                    System.out.printf("%.2f", salesQuantity * 0.08);
                } else if(salesQuantity > 1000 && salesQuantity <= 10000){
                    System.out.printf("%.2f", salesQuantity * 0.12);
                } else if(salesQuantity > 10000) {
                    System.out.printf("%.2f", salesQuantity * 0.145);
                } else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
        }
        sc.close();
    }
}
