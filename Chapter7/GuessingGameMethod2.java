/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter7;

/**
 *
 * @author modip
 */
import java.util.Scanner;

public class GuessingGameMethod2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Let's play a guessing game!");
        do {
            playARound();
        } while (askForAnotherRound());
        System.out.println("\nThank you for playing!");
    }

    public static void playARound() {
        boolean validInput;
        int number, guess;
        String answer;
        // Pick a random number
        number = getRandomNumber();
        // Get the guess
        System.out.println("\nI'm thinking of a number "
                + "between 1 and 10.");
        System.out.print("What do you think it is? ");
        guess = getGuess();
// Check the guess
        if (guess == number) {
            System.out.println("You're right!");
        } else {
            System.out.println("You're wrong!"
                    + " The number was " + number);
        }
    }

    public static int getRandomNumber() {
        return (int) (Math.random() * 10) + 1;
    }

    public static int getGuess() {
        while (true) {
            int guess = sc.nextInt();
            if ((guess < 1) || (guess > 10)) {
                System.out.print("I said, between 1 and 10. "
                        + "Try again: ");
            } else {
                return guess;
            }
        }
    }

    public static boolean askForAnotherRound() {
        while (true) {
            String answer;
            System.out.print("\nPlay again? (Y or N) ");
            answer = sc.next();
            if (answer.equalsIgnoreCase("Y")) {
                return true;
            } else if (answer.equalsIgnoreCase("N")) {
                return false;
            }
        }
    }
}
