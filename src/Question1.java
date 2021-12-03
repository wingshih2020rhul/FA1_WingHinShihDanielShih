/*  Wing Hin Shih (Daniel) 2586897
            16/11/2021             */

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        // Initialise scanner and sum
        Scanner sc = new Scanner(System.in);
        double sum = 0;

        // Prompt user for input
        System.out.print("Enter an integer: ");

        // Get user input in n and calculate series
        for (int n = Math.abs(sc.nextInt()); n > 0; n--) {
            sum += 1.0 / n;
        }

        // Output result
        System.out.println("The sum of the series is: " + sum);
    }
}

/*
Example output:

Enter an integer: 2
The sum of the series is :1.5

Enter an integer: 5
The sum of the series is: 2.283333333333333
 */