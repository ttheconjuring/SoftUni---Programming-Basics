package FirstStepsInCodingLab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dogPackets = Integer.parseInt(sc.nextLine());
        int catPackets = Integer.parseInt(sc.nextLine());
        double sum = dogPackets * 2.5 + catPackets * 4;
        System.out.println(sum);
        sc.close();
    }
}
