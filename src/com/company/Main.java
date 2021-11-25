package com.company;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void clearScreen() { // Om het console scherm schoon te vegen, maar werkt niet lol
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void readAndClear() { // Om na het converten terug te keren naar het begin van het programma
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\n");
        System.out.println("Press enter to return to start...");
        scan.nextLine();
        System.out.flush();
        scan.nextLine();
    }

    public static void main(String[] args) {
        //StandardCharsets charset = new StandardCharsets();
        Scanner scan = new Scanner(System.in);
        CharacterSymbols Char = new CharacterSymbols(); // De symbolen voor de munteenheid
        String currencyGivenByUser;
        double amountGivenByUser;
        String convertedCurrency;
        double convertedAmount;
        boolean program = true;
        while (program == true) {
            System.out.println("WELCOME TO THE CURRENCY CONVERTER! *JAVA*");
            System.out.println("Please insert the current currency (Euro, Pound, Dollar, Yen, Bitcoin): ");
            currencyGivenByUser = scan.nextLine().toLowerCase();
            System.out.println("Please insert the amount of money you want to convert: ");
            //todo try catch of while loop voor INT check
        }
    }
}
