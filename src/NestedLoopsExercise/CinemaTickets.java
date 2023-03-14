package NestedLoopsExercise;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filmTitle = sc.nextLine();
        int freeSpots;
        String ticketType;

        int takenSpots;
        int standardTicketCounter = 0;
        int studentTicketCounter = 0;
        int kidTicketCounter = 0;
        int ticketCounter = 0;

        boolean isEnd;

        while (!filmTitle.equals("Finish")) {
            freeSpots = Integer.parseInt(sc.nextLine());
            takenSpots = 0;
            isEnd = false;
            for (int i = 1; i <= freeSpots; i++) {
                ticketType = sc.nextLine();
                if(ticketType.equals("End")) {
                    isEnd = true;
                    System.out.printf("%s - %.2f%% full.%n", filmTitle, takenSpots * 1.0 / freeSpots * 100);
                    break;
                }
                takenSpots++;
                ticketCounter += 1;
                switch (ticketType) {
                    case "standard":
                        standardTicketCounter++;
                        break;
                    case "student":
                        studentTicketCounter++;
                        break;
                    case "kid":
                        kidTicketCounter++;
                        break;
                    default:
                        System.out.println("error");
                }
            }
            if(!isEnd) {
                System.out.printf("%s - %.2f%% full.%n", filmTitle, takenSpots * 1.0 / freeSpots * 100);
            }
            filmTitle = sc.nextLine();
        }
        System.out.println("Total tickets: " + ticketCounter);
        System.out.printf("%.2f%% student tickets.%n", studentTicketCounter * 1.0 / ticketCounter * 100);
        System.out.printf("%.2f%% standard tickets.%n", standardTicketCounter * 1.0 / ticketCounter * 100);
        System.out.printf("%.2f%% kids tickets.%n", kidTicketCounter * 1.0 / ticketCounter * 100);

        sc.close();
    }
}
