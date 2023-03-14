package FirstStepsInCodingMoreExercises;

import java.util.Scanner;

public class WeatherForecast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String comment = sc.nextLine();
        if(comment.equals("sunny")){
            System.out.println("It's warm outside!");
        } else {
            System.out.println("It's cold outside!");
        }
        sc.close();
    }
}
