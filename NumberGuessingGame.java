import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int Guess = random.nextInt(100) + 1; 
        int userGuess = 0;
        int maxAttempts = 10;  
        int attemptCount = 0;  
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome Buddy!");
        System.out.println("I'm thinking of a number between 1 and 100. Lets see whether you can guess it");
        System.out.println("You have " + maxAttempts + " attempts to guess the correct number.");
        while (userGuess != Guess && attemptCount < maxAttempts) {
            attemptCount++;
            System.out.print("Attempt " + attemptCount + ": Guess it: ");
            userGuess = in.nextInt();
            if (userGuess < Guess) {
                System.out.println("Too low. Try again.");
            } else if (userGuess > Guess) {
                System.out.println("Too high. Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number correctly.");
                break;
            }
            if (attemptCount == maxAttempts && userGuess != Guess) {
                System.out.println("Sorry, you've run out of attempts.");
            }
        }
    }
}

