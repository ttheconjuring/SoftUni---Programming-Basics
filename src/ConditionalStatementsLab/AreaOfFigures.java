package ConditionalStatementsLab;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String figure = sc.nextLine();
        if(figure.equals("square")){
            double a = Double.parseDouble(sc.nextLine());
            System.out.printf("%.3f", (Math.pow(a, 2)));
        } else if(figure.equals("rectangle")){
            double a = Double.parseDouble(sc.nextLine());
            double b = Double.parseDouble(sc.nextLine());
            System.out.printf("%.3f", (a * b));
        } else if(figure.equals("circle")){
            double r = Double.parseDouble(sc.nextLine());
            System.out.printf("%.3f", (Math.PI * Math.pow(r, 2)));
        } else if(figure.equals("triangle")){
            double a = Double.parseDouble(sc.nextLine());
            double h = Double.parseDouble(sc.nextLine());
            System.out.printf("%.3f", (a * h / 2));
        }
        sc.close();
    }
}
