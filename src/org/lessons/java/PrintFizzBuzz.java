package org.lessons.java;

import java.util.Scanner;

public class PrintFizzBuzz {
    public static void main(String[] args) {

        /*for (int i = 1; i <= 100; i++){
            if (i % 5 == 0 && i % 3 == 0 ){
                System.out.println("FizzBuzz");
            }
            else if(i % 5 == 0 ){
                System.out.println("Buzz");
            }
            else if( i % 3 == 0 ){
                System.out.println("Fizz");
            }
            else{
                System.out.println(i);
            }
        }*/


        int numbersToCheck = 1;
        boolean checkNumber;

        Scanner scan = new Scanner(System.in);

        do{
            System.out.print("How many numbers to check (between 1 and 1000): ");
            numbersToCheck = Integer.parseInt(scan.nextLine());

            if (numbersToCheck <= 0 || numbersToCheck > 1000){
                checkNumber = false;
                System.out.println("Please insert a number between 1 and 1000");
            }else{
                checkNumber = true;
            }
        }while(!checkNumber);




            int i = 1;
        while(i <= numbersToCheck){
            if (i % 5 == 0 && i % 3 == 0 ){
                System.out.println("FizzBuzz");
            }
            else if(i % 5 == 0 ){
                System.out.println("Buzz");
            }
            else if( i % 3 == 0 ){
                System.out.println("Fizz");
            }
            else{
                System.out.println(i);
            }
            i++;
        }

        scan.close();
    }
}
