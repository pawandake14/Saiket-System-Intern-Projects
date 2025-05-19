
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numToGuess = random.nextInt(100);
        int guess;
        int attempts = 0;
        boolean guessed = false;

        System.out.println("Welcome to the number guessing game!");
        System.out.println("Guess a number between 1 and 100: ");

        while (!guessed) {
            System.out.print("Enter a number between 1 and 100: ");
            guess = sc.nextInt();
            attempts++;

            if (guess == numToGuess) {
                System.out.println("Congratulations! You guessed it!");
            } else {
                System.out.println("Sorry, please try again!");
            }
        }
        sc.close();
    }
}
