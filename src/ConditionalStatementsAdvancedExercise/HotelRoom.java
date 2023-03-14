package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String month = sc.nextLine();
        int days = Integer.parseInt(sc.nextLine());

        double studioPrice = 0.0;
        double apartmentPrice = 0.0;
        switch (month) {
            case "May":
            case "October":
                studioPrice = days * 50;
                apartmentPrice = days * 65;
                if(days > 14){
                    studioPrice -= studioPrice * 0.3;
                    apartmentPrice -= apartmentPrice * 0.1;
                } else if(days > 7){
                    studioPrice -= studioPrice * 0.05;
                }
                System.out.printf("Apartment: %.2f lv.", apartmentPrice);
                System.out.println();
                System.out.printf("Studio: %.2f lv.", studioPrice);
                break;
            case "June":
            case "September":
                studioPrice = days * 75.2;
                apartmentPrice = days * 68.7;
                if(days > 14){
                    studioPrice -= studioPrice * 0.2;
                    apartmentPrice -= apartmentPrice * 0.1;
                }
                System.out.printf("Apartment: %.2f lv.", apartmentPrice);
                System.out.println();
                System.out.printf("Studio: %.2f lv.", studioPrice);
                break;
            case "July":
            case "August":
                studioPrice = days * 76;
                apartmentPrice = days * 77;
                if(days > 14){
                    apartmentPrice -= apartmentPrice * 0.1;
                }
                System.out.printf("Apartment: %.2f lv.", apartmentPrice);
                System.out.println();
                System.out.printf("Studio: %.2f lv.", studioPrice);
                break;
            default:
                System.out.println("error");
        }

        sc.close();
    }
}
