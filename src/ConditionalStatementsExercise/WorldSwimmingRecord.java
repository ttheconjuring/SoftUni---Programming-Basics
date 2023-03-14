package ConditionalStatementsExercise;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double worldRecord = Double.parseDouble(sc.nextLine());
        double distance = Double.parseDouble(sc.nextLine());
        double timePerMeter = Double.parseDouble(sc.nextLine());
        double delay = Math.floor(distance / 15) * 12.5;
        double ivanRecord = distance * timePerMeter + delay;
        if(ivanRecord < worldRecord){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", ivanRecord);
        } else {
            System.out.printf("No, he failed! He was %.2f second slower.", (ivanRecord - worldRecord));
        }
        sc.close();
    }
}
