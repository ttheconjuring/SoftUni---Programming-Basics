package WhileLoopMoreExecises;

import java.util.Scanner;

public class StreamOfLetters {

    public static boolean isAlright(String input) {
        char[] array = input.toCharArray();
        int n = array.length;
        for (char c : array) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String str = "";
        boolean flag;
        String secretStr = "";

        while (!input.equals("End")) {
            flag = isAlright(input);
            if (!flag) {
                str = str + "";
                input = sc.nextLine();
            } else {
                if (input.equals("c")) {
                    if (secretStr.contains("c")) {
                        str = str + input;
                        input = sc.nextLine();
                    } else {
                        secretStr = secretStr + input;
                        if (secretStr.contains("c") && secretStr.contains("o") && secretStr.contains("n")) {
                            System.out.print(str + " ");
                            str = "";
                            secretStr = "";
                        }
                        input = sc.nextLine();
                    }
                } else if (input.equals("o")) {
                    if (secretStr.contains("o")) {
                        str = str + input;
                        input = sc.nextLine();
                    } else {
                        secretStr = secretStr + input;
                        if (secretStr.contains("c") && secretStr.contains("o") && secretStr.contains("n")) {
                            System.out.print(str + " ");
                            str = "";
                            secretStr = "";
                        }
                        input = sc.nextLine();
                    }
                } else if (input.equals("n")) {
                    if (secretStr.contains("n")) {
                        str = str + input;
                        input = sc.nextLine();
                    } else {
                        secretStr = secretStr + input;
                        if (secretStr.contains("c") && secretStr.contains("o") && secretStr.contains("n")) {
                            System.out.print(str + " ");
                            str = "";
                            secretStr = "";
                        }
                        input = sc.nextLine();
                    }
                } else {
                    str = str + input;
                    input = sc.nextLine();
                }
            }
        }
        sc.close();
    }
}
