/*  Wing Hin Shih (Daniel) 2586897
            16/11/2021             */

import java.util.Random;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        // Initialise scanner and random
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        // Initialise guess and number (1-100)
        int guess, number = rand.nextInt(1, 101);

        // Prompt user for first guess
        System.out.print("Enter a guess: ");
        guess = sc.nextInt();

        // Repeat if incorrect guess
        while (guess != number) {
            // If guess is low, print too low; if high, print too high
            if (guess < number)
                System.out.println("Too low");
            else
                System.out.println("Too high");

            // Ask user to guess again
            System.out.print("Guess again: ");
            guess = sc.nextInt();
        }

        // Output correct number
        System.out.println("Congratulations!\nThe correct number is: " + number);
    }
}

/*
Example output:

Enter a guess: 50
Too low
Guess again: 75
Too high
Guess again: 62
Too high
Guess again: 56
Too low
Guess again: 59
Congratulations!
The correct number is: 59
*/
