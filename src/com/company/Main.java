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
        String firstCurrency;
        double firstAmount;
        String secondCurrency;
        double secondAmount;
        boolean program = true;
        while (program == true) {
            System.out.println("WELCOME TO THE CURRENCY CONVERTER! *JAVA*");
            System.out.println("Please insert the current currency (Euro, Pound, Dollar, Yen, Bitcoin): ");
            firstCurrency = scan.nextLine().toLowerCase();
            System.out.println("TEST");
            System.out.println("Please insert the amount of money you want to convert: ");
            while (!scan.hasNextDouble()){
                System.out.println("Please enter numbers only!");
                System.out.println("Please insert the amount of money you want to convert: ");
                //todo Dit even uitzoeken, vooral waarom continue zo anders werkt in Java... dafuq
            }
            System.out.println("QUE?!");
        }
    }
}
