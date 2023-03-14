package FirstStepsInCodingExercise;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nylon = Integer.parseInt(sc.nextLine());
        int paint = Integer.parseInt(sc.nextLine());
        int diluent = Integer.parseInt(sc.nextLine());
        int hours = Integer.parseInt(sc.nextLine());
        double nylonPrice = (nylon + 2) * 1.5;
        double paintPrice = (paint + (paint * 0.1)) * 14.5;
        int diluentPrice = diluent * 5;
        double sum = nylonPrice + paintPrice + diluentPrice + 0.4;
        double paymentPerHour = sum * 0.3;
        double workersPayment = hours * paymentPerHour;
        double expenses = sum + workersPayment;
        System.out.println(expenses);
        sc.close();
    }
}
