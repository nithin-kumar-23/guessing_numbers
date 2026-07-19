import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class DecodeLabs_Java_P1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int score = 0;
        char playAgain;

        do {

            int target = random.nextInt(100) + 1; // Random number 1-100
            int attempts = 0;
            int maxAttempts = 10;
            boolean guessed = false;

            System.out.println("\n===== NUMBER GUESSING GAME =====");
            System.out.println("Guess a number between 1 and 100");
            System.out.println("You have " + maxAttempts + " attempts.");

            while (!guessed && attempts < maxAttempts) {

                try {
                    System.out.print("\nEnter your guess: ");
                    int guess = sc.nextInt();
                    attempts++;

                    if (guess == target) {
                        System.out.println("🎉 Congratulations! You guessed the correct number.");
                        System.out.println("Attempts used: " + attempts);
                        score++;
                        guessed = true;
                    } 
                    else if (guess < target) {
                        System.out.println("Too Low!");
                    } 
                    else {
                        System.out.println("Too High!");
                    }

                    System.out.println("Remaining Attempts: " + (maxAttempts - attempts));

                } 
                catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please enter an integer.");
                    sc.next(); // Clear invalid input
                }
            }

            if (!guessed) {
                System.out.println("\nGame Over!");
                System.out.println("The correct number was: " + target);
            }

            System.out.println("\nCurrent Score: " + score);

            System.out.print("\nDo you want to play again? (Y/N): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'Y' || playAgain == 'y');

        System.out.println("\n===== FINAL SCORE =====");
        System.out.println("Games Won: " + score);
        System.out.println("Thank you for playing!");

        sc.close();
    }
}