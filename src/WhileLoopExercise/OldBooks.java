package WhileLoopExercise;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String anisBook = sc.nextLine();
        String book = sc.nextLine();
        int counter = 0;
        while (!book.equals(anisBook)) {
            book = sc.nextLine();
            counter++;
            if (book.equals("No More Books")) {
                System.out.println("The book you search is not here!");
                System.out.println("You checked " + counter + " books.");
                break;
            }
        }
        if (!book.equals("No More Books")) {
            System.out.println("You checked " + counter + " books and found it.");
        }
        sc.close();
    }
}
