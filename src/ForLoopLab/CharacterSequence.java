package ForLoopLab;

import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            System.out.println(str.charAt(i));
        }
        sc.close();
    }
}
