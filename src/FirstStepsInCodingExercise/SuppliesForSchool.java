package FirstStepsInCodingExercise;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int penPackets = Integer.parseInt(sc.nextLine());
        int markerPackets = Integer.parseInt(sc.nextLine());
        int litresCleaningSpray = Integer.parseInt(sc.nextLine());
        int discount = Integer.parseInt(sc.nextLine());
        double pensPrice = penPackets * 5.8;
        double markersPrice = markerPackets * 7.2;
        double litersPrice = litresCleaningSpray * 1.2;
        double price = pensPrice + markersPrice + litersPrice;
        double finalPrice = price - (price * discount * 0.01);
        System.out.println(pensPrice);
        System.out.println(markersPrice);
        System.out.println(litersPrice);
        System.out.println(price);
        System.out.println(finalPrice);
        sc.close();
    }
}

