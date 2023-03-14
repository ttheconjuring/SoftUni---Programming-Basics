package ForLoopExercise;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tabs = Integer.parseInt(sc.nextLine());
        double salary = Double.parseDouble(sc.nextLine());
        String website;
        for (int i = 0; i < tabs; i++) {
            website = sc.nextLine();
            if (website.equals("Facebook")) {
                salary -= 150;
                if (salary <= 0) {
                    System.out.println("You have lost your salary.");
                    break;
                }
            } else if (website.equals("Instagram")) {
                salary -= 100;
                if (salary <= 0) {
                    System.out.println("You have lost your salary.");
                    break;
                }
            } else if (website.equals("Reddit")) {
                salary -= 50;
                if (salary <= 0) {
                    System.out.println("You have lost your salary.");
                    break;
                }
            } else {
                salary -= 0;
                if (salary <= 0) {
                    System.out.println("You have lost your salary.");
                    break;
                }
            }
        }
        if (salary > 0) {
            System.out.printf("%.0f", salary);
        }
        sc.close();
    }
}
