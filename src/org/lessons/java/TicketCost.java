package org.lessons.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TicketCost {
    public static void main(String[] args) {

        double euroForKm = 0.21;
        int kmsToRide;
        int agePassenger;

        Scanner scan = new Scanner(System.in);
        System.out.print("Kms to ride: ");
        kmsToRide = Integer.parseInt(scan.nextLine());

        System.out.print("Your age: ");
        agePassenger = Integer.parseInt(scan.nextLine());

        scan.close();

        double ticketPrice = kmsToRide * euroForKm;

        if (agePassenger < 18) {
            ticketPrice *= 0.8;
        } else if (agePassenger > 65) {
            ticketPrice *= 0.6;
        }

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println(df.format(ticketPrice) + " euro");
    }
}