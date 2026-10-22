package Tutorial1;

import java.util.Random;
import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int secret = rand.nextInt(100) + 1;

        System.out.print("Guess a number between 1 and 100: ");
        int guess = input.nextInt();
        int tries = 1;

        while (guess != secret) {
            if (guess > secret) {
                System.out.print("Too high! Try again: ");
            } else {
                System.out.print("Too low! Try again: ");
            }
            guess = input.nextInt();
            tries++;
        }
        System.out.println("Correct! You got it in " + tries + " tries");
    }
}
