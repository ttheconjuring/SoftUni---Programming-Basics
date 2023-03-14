package WhileLoopLab;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        String password = sc.nextLine();
        String pass = sc.nextLine();
        while (!pass.equals(password)) {
            pass = sc.nextLine();
        }
        System.out.println("Welcome " + username + "!");
        sc.close();
    }
}
