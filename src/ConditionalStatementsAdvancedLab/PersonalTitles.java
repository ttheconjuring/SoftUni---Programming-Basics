package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double age = Double.parseDouble(sc.nextLine());
        String gender = sc.nextLine();
        if(gender.equals("m")){
            if(age < 16){
                System.out.println("Master");
            } else {
                System.out.println("Mr.");
            }
        } else if(gender.equals("f")){
            if(age < 16){
                System.out.println("Miss");
            } else {
                System.out.println("Ms.");
            }
        } else {
            System.out.println("-_-");
        }
        sc.close();
    }
}
