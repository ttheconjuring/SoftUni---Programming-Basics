package FirstStepsInCodingLab;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String name = sc.nextLine();
        int projects = Integer.parseInt(sc.nextLine());
        int hours = projects * 3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, hours, projects);
        sc.close();
    }
}
