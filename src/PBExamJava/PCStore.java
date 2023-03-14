package PBExamJava;

import java.util.Scanner;

public class PCStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double CPUPrice = Double.parseDouble(sc.nextLine());
        double GPUPrice = Double.parseDouble(sc.nextLine());
        double RAMPrice = Double.parseDouble(sc.nextLine());
        int RAMDiscs = Integer.parseInt(sc.nextLine());
        double discount = Double.parseDouble(sc.nextLine()); // %

        double CPUInLv = CPUPrice * 1.57;
        double GPUInLv = GPUPrice * 1.57;
        double RAMInLv = RAMPrice * 1.57;
        double totalRamInLv = RAMInLv * RAMDiscs;
        double CPUAfterDiscount = CPUInLv - (CPUInLv * discount);
        double GPUAfterDiscount = GPUInLv - (GPUInLv * discount);
        double total = CPUAfterDiscount + GPUAfterDiscount + totalRamInLv;

        System.out.printf("Money needed - %.2f leva.", total);

        sc.close();
    }
}
