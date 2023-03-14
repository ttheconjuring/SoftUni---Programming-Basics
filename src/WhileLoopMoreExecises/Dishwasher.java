package WhileLoopMoreExecises;

import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bottles = Integer.parseInt(sc.nextLine());
        int litters = bottles * 750;
        int plates;
        int pots;
        String status = "";
        int counter = 0;
        int plateCounter = 0;
        int potCounter = 0;
        while (litters >= 0) {
            status = sc.nextLine();
            if(status.equals("End")) {
                break;
            }
            if(counter == 2) {
                pots = Integer.parseInt(status);
                potCounter +=  pots;
                litters -= pots * 15;
                counter = 0;
                continue;
            }
            plates = Integer.parseInt(status);
            plateCounter += plates;
            litters -= plates * 5;
            counter++;
        }
        if(status.equals("End")) {
            System.out.println("Detergent was enough!");
            System.out.println(plateCounter + " dishes and " + potCounter + " pots were washed.");
            System.out.println("Leftover detergent " + litters + " ml.");
        } else {
            System.out.println("Not enough detergent, " + Math.abs(litters) + " ml. more necessary!");
        }
        sc.close();
    }
}
