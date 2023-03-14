package WhileLoopLab;

import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        while (!str.equals("Stop")){
            System.out.println(str);
            str = sc.nextLine();
        }
        sc.close();
    }
}
