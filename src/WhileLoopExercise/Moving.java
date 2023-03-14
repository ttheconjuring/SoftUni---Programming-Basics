package WhileLoopExercise;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = Integer.parseInt(sc.nextLine());
        int length = Integer.parseInt(sc.nextLine());
        int height = Integer.parseInt(sc.nextLine());
        int freeSpace = width * length * height;
        String space = "";
        int takenSpace;
        while (freeSpace > 0) {
            space = sc.nextLine();
            if(space.equals("Done")) {
                break;
            }
            takenSpace = Integer.parseInt(space);
            freeSpace -= takenSpace;
        }
        if(space.equals("Done")) {
            System.out.println(freeSpace + " Cubic meters left.");
        } else {
            System.out.println("No more free space! You need " + Math.abs(freeSpace) + " Cubic meters more.");
        }

        sc.close();
    }
}
