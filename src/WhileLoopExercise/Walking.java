package WhileLoopExercise;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String today = "";
        int steps = 0;
        while (steps <= 10000) {
            today = sc.nextLine();
            if(today.equals("Going home")) {
                today = sc.nextLine();
                steps += Integer.parseInt(today);
                break;
            }
            steps += Integer.parseInt(today);
        }
        if(steps >= 10000) {
            System.out.println("Goal reached! Good job!");
            System.out.println(steps - 10000 + " steps over the goal!");
        } else {
            System.out.println(10000 - steps + " more steps to reach goal.");
        }
        sc.close();
    }
}
