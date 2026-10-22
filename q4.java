package Tutorial1;

import java.util.Random;   

public class q4 {
    public static void main(String[] args) {

        Random rand = new Random();

        int p1 = rand.nextInt(6) + 1;
        int p2 = rand.nextInt(6) + 1;

        System.out.println("Player 1 rolled: " + p1);
        System.out.println("Player 2 rolled: " + p2);
        
        if (p1 > p2) {
            System.out.println("Player 1 wins!");
        } else if (p1 < p2) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a tie!");
        }



    }
}