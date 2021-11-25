package com.company;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void readAndClear(){
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
        CharacterSymbols charSymbols = new CharacterSymbols();
        String currencyGivenByUser;
        double amountGivenByUser;
        String convertedCurrency;
        double convertedAmount;
        boolean program = true;
        while (program == true) {
            System.out.println("WELCOME TO THE CURRENCY CONVERTER! *JAVA*");
            System.out.println("Please insert the current currency (Euro, Pound, Dollar, Yen, Bitcoin): ");
            currencyGivenByUser = scan.nextLine().toLowerCase();
            do {
                System.out.println("Please insert the amount of money you want to convert: ");
                while (!scan.hasNextInt()) {
                    System.out.println("Please insert numbers only!");
                }
                amountGivenByUser = scan.nextInt();
            } while (amountGivenByUser > 0);

            System.out.println("What is the currency you want to convert to? (Euro, Pound, Dollar, Yen, Bitcoin): ");
        }
    }
}
