import java.util.Scanner;
import java.util.Random;

public class Task1_intership{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        boolean start = true;

        while (start) {
            int guess = ran.nextInt(100) + 1; // Generate random number between 1 and 100
            boolean correctGuessed = false;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.print("Enter the number of attempts you want to take: ");
            int attempts = sc.nextInt(); // Number of attempts
            sc.nextLine(); // Consume newline character left by nextInt()

            System.out.println("You need to guess a number between 1 and 100 in " + attempts + " attempts.");

            for (int i = 0; i < attempts; i++) {
                System.out.print("Enter your guess: ");
                int num = sc.nextInt();
                sc.nextLine(); // Consume newline character left by nextInt()

                if (num == guess) {
                    System.out.println("Congratulations! You guessed the correct number: " + num);
                    correctGuessed = true;
                    break; // Exit loop if correct guess
                } else if (num < guess) {
                    System.out.println("Your guess is too low. Try again.");
                } else {
                    System.out.println("Your guess is too high. Try again.");
                }

                System.out.println("You have " + (attempts - i - 1) + " attempts left.");
            }

            if (!correctGuessed) {
                System.out.println("Sorry, you've used all your attempts. The correct number was: " + guess);
            }

            System.out.print("\nDo you want to play again? (Please answer in Yes or No): ");
            String response = sc.nextLine();
            if (!response.equalsIgnoreCase("yes")) {
                start = false;
            }
        }

        System.out.println("Thank you for playing! Goodbye.");
        sc.close();
    }
}
