import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;
        int userGuess = 0;
        boolean correctInput;

        do {
            System.out.print("Think of a number between 1-10: ");
            if (in.hasNextInt()) {
                userGuess = in.nextInt();
                if (userGuess >= 1 && userGuess <= 10) {
                    correctInput = true;
                } else {
                    System.out.println("Incorrect number. Must be between 1 and 10.");
                    correctInput = false;
                }
            } else {
                String trash = in.next(); // Use next() to consume the invalid input
                System.out.println("Incorrect input: " + trash);
                correctInput = false;
                in.nextLine(); // Clear the invalid input from the buffer
            }
        } while (!correctInput);

        System.out.println("Random number is: " + randomNumber);
        if (userGuess < randomNumber) {
            System.out.println("Your number is too small.");
        } else if (userGuess > randomNumber) {
            System.out.println("Your number is too big.");
        } else {
            System.out.println("You guessed correctly!");
        }

        in.close(); // Close the scanner
    }
}
