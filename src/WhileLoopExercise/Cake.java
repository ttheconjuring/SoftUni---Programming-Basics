package WhileLoopExercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = Integer.parseInt(sc.nextLine());
        int length = Integer.parseInt(sc.nextLine());
        int cakePieces = width * length;
        String pieces = "";
        int takenPieces;
        while (cakePieces > 0) {
            pieces = sc.nextLine();
            if(pieces.equals("STOP")){
                break;
            }
            takenPieces = Integer.parseInt(pieces);
            cakePieces -= takenPieces;
        }
        if(pieces.equals("STOP")) {
            System.out.println(cakePieces + " pieces are left.");
        } else {
            System.out.println("No more cake left! You need " + Math.abs(cakePieces) + " pieces more.");
        }
        sc.close();
    }
}
