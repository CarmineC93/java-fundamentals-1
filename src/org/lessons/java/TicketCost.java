package org.lessons.java;

import java.util.Scanner;

public class TicketCost {
    public static void main(String[] args) {

/*        Consegna:
 Il programma dovrà chiedere all’utente il numero (intero) di chilometri che vuole percorrere e l’età del passeggero (numero intero).
                Sulla base di queste informazioni dovrà calcolare il prezzo totale del viaggio, secondo queste regole:
        il prezzo del biglietto è definito in base ai km (0.21 € al km)
        va applicato uno sconto del 20% per i minorenni
        va applicato uno sconto del 40% per gli over 65
        Per chiedere informazioni all’utente sarà necessario usare la classe java.util.Scanner, come visto in classe stamattina.
        Bonus: formattare il risultato con un numero limitato di decimali utilizzando la classe DecimalFormat*/

        double euroForKm = 0.21;
        int kmsToRide;
        int agePassenger;

        Scanner scan = new Scanner(System.in);
        System.out.print("Kms to ride: ");
        kmsToRide = Integer.parseInt(scan.nextLine());

        System.out.print("Your age: ");
        agePassenger = Integer.parseInt(scan.nextLine());

        double ticketPrice = kmsToRide * euroForKm;

        if (agePassenger < 18) {
            ticketPrice *= 0.8;
        } else if (agePassenger > 65) {
            ticketPrice *= 0.6;
        }

        System.out.println(ticketPrice + " euro");
    }
}