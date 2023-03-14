package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String product = sc.nextLine();
        String city = sc.nextLine();
        double quantity = Double.parseDouble(sc.nextLine());
        switch (product){
            case "coffee":
                switch (city){
                    case "Sofia":
                        System.out.println(quantity * 0.5);
                        break;
                    case "Plovdiv":
                        System.out.println(quantity * 0.4);
                        break;
                    case "Varna":
                        System.out.println(quantity * 0.45);
                        break;
                }
                break;
            case "water":
                switch (city){
                    case "Sofia":
                        System.out.println(quantity * 0.8);
                        break;
                    case "Plovdiv":
                    case "Varna":
                        System.out.println(quantity * 0.7);
                        break;
                }
                break;
            case "beer":
                switch (city){
                    case "Sofia":
                        System.out.println(quantity * 1.2);
                        break;
                    case "Plovdiv":
                        System.out.println(quantity * 1.15);
                        break;
                    case "Varna":
                        System.out.println(quantity * 1.1);
                        break;
                }
                break;
            case "sweets":
                switch (city){
                    case "Sofia":
                        System.out.println(quantity * 1.45);
                        break;
                    case "Plovdiv":
                        System.out.println(quantity * 1.3);
                        break;
                    case "Varna":
                        System.out.println(quantity * 1.35);
                        break;
                }
                break;
            case "peanuts":
                switch (city){
                    case "Sofia":
                        System.out.println(quantity * 1.6);
                        break;
                    case "Plovdiv":
                        System.out.println(quantity * 1.5);
                        break;
                    case "Varna":
                        System.out.println(quantity * 1.55);
                        break;
                }
                break;
            default:
                System.out.println("Error");
        }
        sc.close();
    }
}
