package ForLoopLab;

import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        int counter = 0;
        for (int i = 0; i < n; i++) {
            if(str.charAt(i) == 'a'){
                counter += 1;
            } else if(str.charAt(i) == 'e'){
                counter += 2;
            } else if (str.charAt(i) == 'i') {
                counter += 3;
            } else if(str.charAt(i) == 'o'){
                counter += 4;
            } else if (str.charAt(i) == 'u') {
                counter += 5;
            }
        }
        System.out.println(counter);
        sc.close();
    }
}
